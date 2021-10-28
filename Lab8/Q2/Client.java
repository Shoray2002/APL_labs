import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());

        System.out.println("Sending hello to server");
        out.write("Hello!\n");
        out.flush();
        System.out.println("Server replied: ");
        System.out.println(in.readLine());

        out.close();
        in.close();
        socket.close();
    }
}
