package Lab3.Q5;

public class Main {
    public static void main(String[] args) {
        var utensil=new Utensil();
        utensil.madeof();
        var spoon = new Spoon();
        spoon.madeof(); // overriding the method defined in Utensil class
        spoon.madeof("Silver"); // overloading the method already defined in Spoon class
    }
}

