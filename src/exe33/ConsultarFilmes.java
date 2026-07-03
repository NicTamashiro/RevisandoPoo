package exe33;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarFilmes {
    private HttpClient client = HttpClient.newHttpClient();
    private Gson gson = new Gson();
    private String apikey = "1da600ca";

    public Titulo buscarTitulo(String nomeFilme) throws TituloNaoEncontradoException, IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?t=" + nomeFilme + "&apikey=" + apikey)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Titulo titulo = gson.fromJson(response.body(), Titulo.class);

        if(titulo.titulo() == null){
            throw new TituloNaoEncontradoException("Filme '" + nomeFilme +  "'nao encontrado.");
        }

        return titulo;
    }
}
