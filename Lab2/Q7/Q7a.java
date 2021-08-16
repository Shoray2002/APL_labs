package Lab2.Q7;

public class Q7a {
    static int multiply(int x, int y) {
        return x * y;
    }
    static double multiply(double x, double y, double z) {
        return x * y * z;
    }
    static double multiply(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        // System.out.println("**** Using Constructor Overloading ****");
        System.out.println("Multiplying 4 and 5 : " + multiply(4, 5));
        System.out.println("Multiplying 2.36, 3.98, and 4 : " + multiply(2.36, 3.98, 4));
        System.out.println("Multiplying 2.68 and 3.5 : " + multiply(2.68, 3.5));
    }

}
