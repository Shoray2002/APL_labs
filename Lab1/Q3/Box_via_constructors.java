package Lab1.Q3;
class Box_via_constructors {
        public static void main(String[] args) {
            System.out.println("Volumes of various boxes: ");
            new Box_c(3.62, 4.89, 5.78);
            new Box_c(4.225);
            new Box_c();
        }
    
}


class Box_c {
    double l,b,h,vol;

    Box_c(double l, double b, double h) {
        this.l =l ;
        this.b = b;
        this.h = h;
        vol = l*b*h;

        System.out.printf("Volume of box of length %f, breadth %f, and hight %f is: %f\n",l,b,h,vol);
    }

    Box_c() {
        this(1, 1, 1);
    }

    Box_c(double a) {
        this(a, a, a);
    }
}
