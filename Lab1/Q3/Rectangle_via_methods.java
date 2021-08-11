package Lab1.Q3;

public class Rectangle_via_methods {
    public static void main(String[] args) {
        System.out.println("Areas of various circles: ");
        Rectangle_methods.calculateArea(5,8);
        Rectangle_methods.calculateArea(25.68, 15.36);
        Rectangle_methods.calculateArea();
    } 
}


class Rectangle_methods {
    public static double calculateArea(double l, double b) {
        double area = l * b;
        System.out.printf("Area of Rectangle of lenght %f and breadth %f is: %f\n",l,b,area);

        return area;
    }
    
    public static double calculateArea() {
        return calculateArea(1,1);
    }

}
