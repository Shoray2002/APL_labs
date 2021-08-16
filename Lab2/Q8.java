package Lab2;
public class Q8 {
    // Write a Java program to print the Fibonacci series of the number up to 100
    public static void main(String[] args) {
        System.out.println("Fibonacci series up to 100 :");
        int x = 1, y = 1;
        while (x < 100) {
            System.out.println(x);
            y += x;
            x = y-x;
        }
    }
}
