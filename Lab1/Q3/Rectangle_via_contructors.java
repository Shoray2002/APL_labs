package Lab1.Q3;

public class Rectangle_via_contructors {
        public static void main(String[] args) {
        System.out.println("Areas of various rectangles: ");
        new Rectangle_c(5,8);
        new Rectangle_c(25.68, 15.36);
        new Rectangle_c();
    }
        
}

class Rectangle_c {
    double l,b,area;
    Rectangle_c(double l, double b) {
       this.l = l;
       this.b = b;
       area=l*b;
       System.out.printf("Area of Rectangle of lenght %f and breadth %f is: %f\n",l,b,area);
    }
    Rectangle_c()
     {
       this(1.0,1.0);
    }
}