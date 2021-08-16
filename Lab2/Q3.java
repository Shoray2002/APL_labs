package Lab2;

public class Q3 {
    public static void main(String[] args) {
        var m1 = new Mobile(30000, "Sony", "Shoray Singhal");
        var m2 = new Mobile(60000, "Zeiss", "Kirti Singhal");
        var m3 = new Mobile(95000, "Apple", "Priyanshu Upadhyay");

        m1.print();
        m2.print();
        m3.print();
    }
}


class Mobile {
    private int cost;
    private String camera;
    public String username;

    public Mobile(int cost, String camera, String username) {
        this.cost = cost;
        this.camera = camera;
        this.username = username;
    }

    public void print() {
        System.out.println("Mobile cost: " + cost + "\nCamera: " + camera + "\nUsername: " + username);
        System.out.println("------------------------------------------------------------");
    }
    
}
