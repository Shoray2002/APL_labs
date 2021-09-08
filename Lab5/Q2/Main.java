package Lab5.Q2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Lab5.Q2.pkg2.*;

public class Main {
    public static void main(String args[]) {
        int i, n, sum, min, ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            list.add(sc.nextInt());
        }
        ListSum listSum = new ListSum();
        ListMin listMin = new ListMin();
        try {
            sum = listSum.sum(list);
            min = listMin.min(list);
            ans = listSum.sum(list) / listMin.min(list);
            System.out.println("Sum of the list is: " + sum);
            System.out.println("Minimum of the list is: " + min);
            System.out.println("Answer is: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Here minimum element is 0 and we cannot divide by 0 to get the answer");
        }

    }
}