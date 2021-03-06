public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
       StackTraceElement[]  ste = new Throwable().getStackTrace();
       if (ste.length >=3) {
           return ste[2].getClassName() + '#' + ste[2].getMethodName();
       } else {
           return null;
       }
    }
}

