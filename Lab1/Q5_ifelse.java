package Lab1;
import java.util.Scanner;

public class Q5_ifelse {
   static  double maxer(double a,double b,double c, double d)
    {double max=a;
        
    if (b > max)
        max = b;
    if (c > max)
        max = c;
    if (d > max)
        max = d;
     return max;
        
    }
    
    static  double miner(double a,double b,double c, double d)
    {double min=a;
        
    if (b < min)
        min = b;
    if (c < min)
        min = c;
    if (d < min)
        min = d;
     return min;
        
    }
    
    public static void main(String args[]) {
        System.out.println("Enter the Numbers : ");
     Scanner obj = new Scanner(System.in); 
     double a= obj.nextDouble();
      double b= obj.nextDouble();
       double c= obj.nextDouble();
        double d= obj.nextDouble();
     
    System.out.println("The max of the given numbers is : "+ maxer(a,b,c,d));
    System.out.println("The min of the given numbers is : "+ miner(a,b,c,d));
    }
}

