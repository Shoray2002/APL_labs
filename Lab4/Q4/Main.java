package Lab4.Q4;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nUsing the Divider");
        System.out.println("\nEnter a 10 number Array");
        Divider x = new Divider();
        x.inputArray();
        System.out.println("\nThe Original Array is: ");
        x.displayArray();
        x.divideArray();
        System.out.println("The Divided Array is: ");
        x.displayArray();

        System.out.println("\n\nUsing the Sorter");
        System.out.println("\nEnter a 10 number Array");
        Sorter y = new Sorter();
        y.inputArray();
        System.out.println("\nThe Original Array is: ");
        y.displayArray();
        y.sortArray();
        System.out.println("\nThe Sorted Array is: ");
        y.displayArray();
    }
}