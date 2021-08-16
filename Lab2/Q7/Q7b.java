package Lab2.Q7;


public class Q7b{
    public static void main(String []args) {
        Multiply x=new Multiply(7.58,8);
        Multiply y=new Multiply(1.8,6.05);
        x.display();
        y.display();
    }
}
class Multiply{
    double A,B;
    Multiply(double a,double b){
        A=a;
        B=b;
    }
    void display(){
        System.out.printf("Multiplying %.3f and %.3f : %.2f \n",A,B,A*B);
    }
}