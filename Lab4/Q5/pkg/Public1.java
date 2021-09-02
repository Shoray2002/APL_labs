package Lab4.Q5.pkg;

public class Public1 {
    public static void display() {
        System.out.println("This is Public Class 1.");
    }

    private static class Private {

        public static void display() {
            System.out.println("This is Private Class inside Public Class 1 .");
        }
    }

    public static void displayPrivate() {
        Private.display();
    }
}
