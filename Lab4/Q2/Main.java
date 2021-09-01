package Lab4.Q2;

import Lab4.Q2.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nObject of Class Vehicle: ");
        Vehicle vehicle = new Vehicle("Two-Wheeler","Grey");
        vehicle.display();
        System.out.println("\nObject of Class Car: ");
        Car c = new Car("Four-Wheeler", "Red", "SUV", 200000);
        c.display();
    }
}
