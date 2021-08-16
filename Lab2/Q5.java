package Lab2;
import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
         Scanner s= new Scanner(System.in);
         System.out.println("The following shape areas can be found using this program:-");
         System.out.println("1.Circle");
         System.out.println("2.Pentagon");
         System.out.println("3.Triangle");
         System.out.println("4.Square");
         System.out.println("5.Rectangle");
         System.out.println("\n----------------------------------------\n");
         System.out.println("Choose the figure you want to find the AREA of:");
         int x=s.nextInt();
         switch(x){
             case 1:
                 System.out.println("Enter the radius:");
                 double r=s.nextDouble();
                 System.out.println("The area of the circle is "+ Math.PI*r*r);
                 break;
             case 2:
                 System.out.println("Enter the side of the pentagon:");
                 double a=s.nextDouble();
                 System.out.println("The area of the pentagon is "+1.72*a*a);
                 break;
             case 3:
                 System.out.println("Enter the base of the triangle");
                 double b=s.nextDouble();
                 System.out.println("Enter the height of the triangle");
                 double h=s.nextDouble();
                 System.out.println("The area of the triangle is "+b*h/2);
                 break;
             case 4:
                 System.out.println("Enter the side of the square:");
                 double l=s.nextDouble();
                 System.out.println("The area of the square "+l*l);
                 break;
             case 5:
                 System.out.println("Enter the length of rectangle:");
                 double c=s.nextDouble();
                 System.out.println("Enter breadth of the rectangle:");
                 double z=s.nextDouble();
                 System.out.println("The area of the rectangle is "+c*z); 
                 break;
             default:
                 System.out.println("The area is 0");               

         }
    }
}