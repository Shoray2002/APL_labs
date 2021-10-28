import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        var socket = new DatagramSocket();
        var packet = new DatagramPacket("Hello Shoray".getBytes(), 5, InetAddress.getByName("ping.online.net"), 5206);

        System.out.println("Using packet.getAddress(): " + packet.getAddress());
        System.out.println("Using packet.getData(): " + Arrays.toString(packet.getData()));
        System.out.println("Using packet.getLength(): " + packet.getLength());
        System.out.println("Using packet.getOffset(): " + packet.getOffset());
        System.out.println("Using packet.getSocketAddress(): " + packet.getSocketAddress());
        System.out.println("Using setting packet port to 12345...");
        packet.setPort(12345);
        System.out.println("sending 'Hello Saniya'...");
        socket.send(packet);
    }
}