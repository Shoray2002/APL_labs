package Lab3.Q5;

public class Spoon extends Utensil {
    @Override
    void madeof() {
        System.out.println("The Spoon is made of Stainless Steel");
    }

    void madeof(String material) {
        System.out.println("The Spoon is made of " + material);
    }
}
