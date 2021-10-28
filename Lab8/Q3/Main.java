
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        URL url = new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        System.out.println("Using url.getProtocol(): " + url.getProtocol());
        System.out.println("Using url.getHost(): " + url.getHost());
        System.out.println("Using url.getPort(): " + url.getPort());
        System.out.println("Using url.getAuthority(): " + url.getAuthority());
        System.out.println("Using url.toURI(): " + url.toURI());
        System.out.println("Using url.getQuery(): " + url.getQuery());
    }
}