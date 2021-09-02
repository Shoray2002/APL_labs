package Lab4.Q3.pack;

public class packageClass {
    private static class fourth {
        public static void olá() {
            System.out.println("Ola from Private Class");
        }
        public static void ciáo() {
            System.out.println("Ciáo from Private Class");
        }
    }
    protected static class fifth {
        public static void olá() {
            System.out.println("Ola from Private Class");
        }
    
        public static void ciáo() {
            System.out.println("Ciáo from Private Class");
        }
    }

    public static void hello() {
        System.out.println("Calling Private.olá from here because it cannot be accessed from outside:");
        fourth.olá();
        System.out.println("Calling Protected.olá from here because it cannot be accessed from outside:");
        fifth.olá();
    }
    public static void bye() {
        System.out.println("Calling Private.ciáo from here because it cannot be accessed from outside:");
        fourth.ciáo();
        System.out.println("Calling Protected.ciáo here because it cannot be accessed from outside:");
        fifth.ciáo();
    }
}
