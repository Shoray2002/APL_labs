package Lab3.Q2;
abstract class Arithmetic {
    abstract int addition (int x, int y);
    abstract int subtraction (int x, int y);
    abstract int multiplication (int x, int y);
    abstract double division (int x, int y);
}

class Calculation extends Arithmetic {
    int addition(int x, int y) {
        return x+y;
    }

    int subtraction(int x, int y) {
    
        return x-y;

    }

    int multiplication(int x, int y) {
        return x*y;

    }

    double division(int x, int y) {
        return x/y;
    }

}



