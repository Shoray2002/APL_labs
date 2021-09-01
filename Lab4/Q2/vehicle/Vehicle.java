package Lab4.Q2.vehicle;

public class Vehicle {
    public String type;
    public String color;

    public Vehicle(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void display() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);

    }
}