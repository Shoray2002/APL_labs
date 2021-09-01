package Lab4.Q2;

import Lab4.Q2.vehicle.Vehicle;

public class Car extends Vehicle {
    String car_type;
    int price;

    public Car(String type, String color, String car_type, int price) {
        super(type, color);
        this.car_type = car_type;
        this.price = price;
    }
    @Override
    public void display() {
        System.out.println("Car type: " + car_type);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }

}
