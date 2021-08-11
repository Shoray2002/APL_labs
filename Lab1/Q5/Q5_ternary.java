package Lab1.Q5;
import java.util.Scanner;

public class Q5_ternary {
   static  double maxer(double a,double b,double c, double d)
    {double  tmp1 = a > b ? a : b;
   double tmp2 = c > d ? c : d;

   return tmp1 > tmp2 ? tmp1 : tmp2;
        
    }
    
    static  double miner(double a,double b,double c, double d)
    {double  tmp1 = a < b ? a : b;
   double tmp2 = c < d ? c : d;

   return tmp1 < tmp2 ? tmp1 : tmp2;
        
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

