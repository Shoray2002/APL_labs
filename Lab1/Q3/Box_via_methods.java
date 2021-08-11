package Lab1.Q3;

class Box_via_methods {
    public static void main(String[] args) {
        System.out.println("Volumes of various boxes: ");
        Box_methods.calculateVolume(3.62, 4.89, 5.78);
        Box_methods.calculateVolume(4.225);
        Box_methods.calculateVolume();
    }
    
}


class Box_methods {
    public static double calculateVolume(double l, double b, double h) {
        double vol = l*b*h;
        System.out.printf("Volume of box of length %f, breadth %f, and hight %f is: %f\n",l,b,h,vol);

        return vol;
    }
    public static double calculateVolume(double a) {
        return calculateVolume(a, a, a);
    }
    public static double calculateVolume() {
        return calculateVolume(1, 1, 1);
    }

}


