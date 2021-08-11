package Lab1.Q3;

class Circle_via_methods {
    public static void main(String[] args) {
        System.out.println("Areas of various circles: ");
        Circle_methods.calculateArea(5.25);
        Circle_methods.calculateArea(3.75);
        Circle_methods.calculateArea();
    }
    
}


class Circle_methods {
    public static double calculateArea(double r) {
        double area = Math.PI* r * r;
        System.out.printf("Area of Circle of radius %f is: %f\n",r,area);

        return area;
    }
    
    public static double calculateArea() {
        return calculateArea(1);
    }

}


