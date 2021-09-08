package Lab5.Q5;

import java.util.Arrays;

public class Main {

    static boolean DrinkAge(int age) throws Exception {
        try {
            if (age > 21)
           { System.out.println("You can drink");
                return true;}
            else
                throw new Exception("Age is below 21");
        } catch (Exception e) {
            System.out.println(e);
            if (age < 0)
                throw new Exception("Age is below 0 and impossible");
        } finally {
            if (age > 120)
                throw new Exception("Age is above 120 and impossible");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Checking age 1000: ");
            DrinkAge(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Checking age 25: ");
            DrinkAge(25);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Checking age -100:");
            DrinkAge(-100);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
