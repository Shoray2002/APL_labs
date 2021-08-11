package Lab1;
public class Q6 {
    public static void main(String args[]) {
      int z=8;
       System.out.printf("The Value of z is %d\n",z);
      int a=z++ + ++z;
       System.out.printf("The Value of a= z++ + ++z when z=8 is %d\n",a);
      z=8;
      int b= z-- + --z;
       System.out.printf("The Value of b= z-- + --z when z=8 is %d\n",b);
       z=8;
      int c= z++;
       System.out.printf("The Value of c= z++ when z=8 is %d\n",c);
       z=8;
      int d=++z;
       System.out.printf("The Value of d=++z when z=8 is %d\n",d);
        z=8;
      int e=z--;
       System.out.printf("The Value of e=z-- when z=8 is %d\n",e);
        z=8;
      int f=--z;
       System.out.printf("The Value of f=--z when z=8 is %d\n",f);
     
    }
}