package exe29;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> filmesBusca = List.of("Matrix", "Fight+Club", "Seven");
        List<Titulo> titulos = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();

        for (String filme : filmesBusca){
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?t=" + filme + "&apikey=1da600ca")).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Titulo titulo = gson.fromJson(response.body(), Titulo.class);
                titulos.add(titulo);

            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao buscar " + filme + ": " + e.getMessage());
            }
        }

        for (Titulo titulo : titulos){
            System.out.println(titulo);
        }

    }
}
