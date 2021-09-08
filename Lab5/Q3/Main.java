package Lab5.Q3;

import java.util.Arrays;

public class Main {
    static boolean isPositive(int a) {
        if (a < 0)
            throw new RuntimeException("Given Number is negative");
        else if (a == 0)
            throw new RuntimeException("0 Number is neither positive nor negative");
        else
            return true;
    }

    static boolean verifyAge(int age) throws Exception {
        if (age < 0)
            throw new Exception("Age cannot be negative");
        else if (age < 18)
            throw new Exception("Age is below 18");
        else if (age > 120)
            throw new Exception("Age cannot be above 120");
        else
            return true;
    }

    public static void main(String[] args) {
        try {
            System.out.print("Is 2 positive: ");
            System.out.println(isPositive(2));
            System.out.print("Is -2 positive: ");
            System.out.println(isPositive(-2));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.print("Is 0 positive: ");
            System.out.println(isPositive(0));
        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("End of Checked Exceptions");
        }


        try {
            System.out.print("Is 39 valid age: ");
            System.out.println(verifyAge(39));
            System.out.print("Is 3 valid age: ");
            System.out.println(verifyAge(3));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.print("Is -3 valid age: ");
            System.out.println(verifyAge(-3));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.print("Is 897 valid age: ");
            System.out.println(verifyAge(897));
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("End of Unchecked Exceptions");
        }
    }
}
