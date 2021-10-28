import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("creating a HttpURLConnection");
        HttpURLConnection connection = (HttpURLConnection) new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
                .openConnection();

        System.out.println("setting FixedLengthStreamingMode");
        connection.setFixedLengthStreamingMode(664 + 2168);
        connection.connect();
        System.out.println("Using connection.getInstanceFollowRedirects(): " + connection.getInstanceFollowRedirects());
        System.out.println("Using connection.getHeaderFieldDate(): " + connection.getHeaderFieldDate("expires", 0));
        System.out.println("Using connection.getRequestMethod(): " + connection.getRequestMethod());
        System.out.println("Using connection.usingProxy(): " + connection.usingProxy());
    }
}