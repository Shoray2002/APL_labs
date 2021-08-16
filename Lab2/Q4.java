package Lab2;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        var vehicle = new Vehicle(0, 0);
        vehicle.setLocation(4.69, 21.30);
        System.out.println("Vehicle position in kilometers (rounded): " + Arrays.toString(vehicle.getLocationKilometers()));
        System.out.println("Vehicle position in meters: " + Arrays.toString(vehicle.getLocationMeters()));
    }
}

public class Vehicle {
    double locX, locY;

    public Vehicle(double locX, double locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public int[] getLocationKilometers() {
        return new int[]{(int) Math.rint(locX), (int) Math.rint(locY)};
    }
    public int[] getLocationMeters() {
        return new int[]{(int) Math.rint(locX*1000), (int) Math.rint(locY*1000)};
    }

    void setLocation(double x, double y) {
        locX = x;
        locY = y;
    }
}
