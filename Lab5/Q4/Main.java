package Lab5.Q4;

public class Main {
    public static void main(String[] args) {
        try {
            first();
        } catch (ArithmeticException e) {
            System.out.println("Dividing number by 0 is not allowed");
        }
    }

    public static void first() throws ArithmeticException {
        second();
    }

    public static void second() throws ArithmeticException {
        third();
    }

    public static void third() throws ArithmeticException {
        fourth();
    }

    public static void fourth() throws ArithmeticException {
        int x = 10 / 0;
        System.out.println(x);
    }

}
