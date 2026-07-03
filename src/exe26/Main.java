package exe26;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> titulosBusca = List.of("Matrix", "Fight+Club", "Seven");
        List<String> filmes = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();

        for (String filme : titulosBusca){
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?t=" + filme + "&apikey=1da600ca")).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                filmes.add(response.body());

            } catch (IOException | InterruptedException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }

        for (String filme : filmes){
            System.out.println(filme);
        }

    }
}
