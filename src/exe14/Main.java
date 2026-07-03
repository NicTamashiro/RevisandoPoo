package exe14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Matrix", 8.7));
        filmes.add(new Filme("Coraline", 8.5));
        filmes.add(new Filme("Diario de uma paixao", 8.8));
        filmes.add(new Filme("Gran Turismo", 8.6));

        for (Filme filme : filmes){
            System.out.println(filme);
        }
    }
}
