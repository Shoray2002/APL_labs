package Lab1.Q3;

public class Circle_via_constructors {
    public static void main(String[] args) {
        System.out.println("Areas of various circles: ");
        new Circle_c(5.25);
        new Circle_c(3075);
        new Circle_c();
    }
        
}

class Circle_c {
    double r,area;
    Circle_c(double r) {
       this.r = r;
       area=Math.PI*r*r;
       System.out.printf("Area of Circle of radius %f is: %f\n",r,area);
    }
    Circle_c()
     {
       this(1.0);
    }
}