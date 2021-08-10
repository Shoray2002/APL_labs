import java.util.Scanner;

public class calculator {


    public static void ar_calculator(){
        Scanner keyboardInput = new Scanner(System.in);
        String calculator;
        do {
            System.out.print("\nEnter your first digit: ");
            double num1 = keyboardInput.nextDouble();

            System.out.print("\nEnter your operator: ");
            String op = keyboardInput.next();

            System.out.print("\nEnter your second digit: ");
            double num2 = keyboardInput.nextDouble();

            System.out.print("\n"+num1 + " "+op +" "+ num2+ " = ");

            if (op.equals("+")){
                System.out.print(num1 + num2);
            }else if (op.equals("-")){
                System.out.print(num1 - num2);
            }else if (op.equals("*")){
                System.out.print(num1 * num2);
            }else if (op.equals("/")){
                System.out.print(num1 / num2);
            }else if (op.equals("%")){
                System.out.print(num1 % num2);
            }else{
                System.out.println("\nInvalid operator");
            }
            System.out.print("\nWould you like to restart the calculator? (y or n): ");
            calculator = keyboardInput.next();
        }
        while (calculator.equals("y"));

        if (calculator.equals("n")){
            System.out.println("\nBye");
        }
    }
    
    
    public static void logi_calculator(){
        Scanner keyboardInput = new Scanner(System.in);
        String calculator;
        do {
            

            System.out.print("\nEnter your logical operator (& , | , ~): ");
            String op = keyboardInput.next();
            if (op.equals("&")){
                System.out.print("\nEnter your first digit: ");
            int num1 = keyboardInput.nextInt();
            
            System.out.print("\nEnter your second digit: ");
            int num2 = keyboardInput.nextInt();
                int ans=num1 & num2;
                System.out.print("\n"+num1+" "+ "&" + " "+ num2+" = "+ ans);
            }
            else if (op.equals("|")){
                System.out.print("\nEnter your first digit: ");
            int num1 = keyboardInput.nextInt();
            
            System.out.print("\nEnter your second digit: ");
            int num2 = keyboardInput.nextInt();
            int ans=num1 | num2;
                System.out.print("\n"+num1+" "+ "|" + " "+ num2+" = "+ ans);
            }
            else if (op.equals("~")){
                System.out.print("\nEnter your operand: ");
            int num1 = keyboardInput.nextInt();
            int ans=~num1;
                System.out.print("\n ~ "+num1+" = "+ ans);
            }
            else{
                System.out.println("\nInvalid operator");
            }
            System.out.print("\nWould you like to restart the calculator? (y or n): ");
            calculator = keyboardInput.next();
        }
        while (calculator.equals("y"));
        if (calculator.equals("n"))
        {
            System.out.println("\nBye");
        }
    }
    


    public static void main(String[] args) {
        do{
        System.out.print("\033[H\033[2J");  
    System.out.flush();
        System.out.print("Choose the type of Calculator You want to use :");
        System.out.print("Arithmetic or Logical (a/l) or Exit(e)");
        Scanner p = new Scanner(System.in);
        String choice = p.next();
        switch(choice){
            case "a":ar_calculator();
            break;
            case "l":
                logi_calculator();
                break;
            case "e":
                System.exit(0);
            default:System.out.print("Invalid choice");
            continue;
        }
            
        }
       while(true);
    }
}