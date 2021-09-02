package Lab4.Q4;

import java.util.Scanner;
import java.util.Arrays;

public class Sorter {
    private Scanner sc = new Scanner(System.in);
    private int[] a = new int[10];

    void inputArray() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + " = ");
            a[i - 1] = sc.nextInt();
        }
        System.out.println("\n");
    }

    void displayArray() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(a[i - 1]+" ");
        }
    }

    void sortArray() {
        Arrays.sort(a);
    }
}
