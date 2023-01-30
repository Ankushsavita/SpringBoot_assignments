
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Main {
    public static void main(String[] args) throws Exception {

        String url = "https://api.chucknorris.io/jokes/random";

        // Building a Request
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        // Getting HttpClient Object
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // StatusCode and body
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}