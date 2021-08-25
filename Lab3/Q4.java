package Lab3;
import java.util.*;
public class Q4 {

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter a binary number");
        int binary = cin.nextInt();

        System.out.println("The Decimal equivalent of given Binary number is: " + binToDec(binary, 0));

    }

    private static int binToDec(int bin, int i) {

        if (bin == 0 || bin == 1)
            return (int) Math.pow(2, i) * bin;

        int lastDigit = bin % 10;

        return (int) (Math.pow(2, i) * lastDigit) + binToDec(bin / 10, ++i);

    }
}