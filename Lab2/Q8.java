package Lab2;
public class Q8 {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series up to 100 is :");
        int x = 1, y = 1;
        while (x < 100) {
            System.out.println(x);
            y += x;
            x = y-x;
        }
    }
}
