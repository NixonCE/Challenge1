import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("hola mundo");
        System.out.println("prueba");
        String direccionApi = "https://v6.exchangerate-api.com/v6/50c33799565cdf1cf11364c0/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionApi)).build();
        HttpResponse<String> response = client.send(request , HttpResponse.BodyHandlers.ofString());

        String data = response.body();
        System.out.println(data);

    }
}
