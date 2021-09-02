package Lab4.Q4;

import java.util.Scanner;

public class Divider {
    private Scanner sc = new Scanner(System.in);
    private int divident;
    private int[] a = new int[10];

    void inputArray() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + " = ");
            a[i - 1] = sc.nextInt();
        }
        System.out.println("\n");
    }

    void displayArray() {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void divideArray() {
        System.out.print("\nEnter the divident: ");
        divident = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            try {
                a[i - 1] /= divident;
            } catch (ArithmeticException e) {
                System.out.println("\nDivide by zero error");
            }
        }
        System.out.println("\n");
    }
}