package Lab4.Q3.pack;

public interface Interface {
    static  void olá() {
        System.out.println("Olá from Interface");
    }

    static void ciáo() {
        System.out.println("Ciao from Interface");
    }

    abstract  class AbstractClass1 {
        public static void olá() {
            System.out.println("Olá from AbstractClass1");
        }

        public static void ciáo() {
            System.out.println("Ciáo from AbstractClass1");
        }

    }

    abstract  class AbstractClass2 {
        public static void olá() {
            System.out.println("Olá from AbstractClass2");
        }

        public static void ciáo() {
            System.out.println("Ciáo from AbstractClass2");
        }

    }

    abstract  class AbstractClass3 {
        public static void olá() {
            System.out.println("Olá from AbstractClass3");
        }

        public static void ciáo() {
            System.out.println("Ciáo from AbstractClass3");
        }

    }
}
