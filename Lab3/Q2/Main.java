package Lab3.Q2;
public class Main {

    public static void main(String args[]) {

        Arithmetic object1 = new Calculation();
        System.out.printf("Addition: %d \n", object1.addition(10, 20));
        System.out.printf("Subtraction: %d \n",object1.subtraction(7,9));
        System.out.printf("Multiplication: %d\n",object1.multiplication(5,6));
        System.out.printf("Division: %f\n",object1.division(12,3));
    }

}