package exe21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Matrix", 8.5));
        filmes.add(new Filme("Coraline", 9));
        filmes.add(new Filme("Diario de uma paixao", 8.8));
        filmes.add(new Filme("Gran Turismo", 7.5));

        System.out.println("=== Lista de filmes em ORDEM DECRESCENTE ===");
        Collections.sort(filmes);

        for (Filme filme : filmes){
            System.out.println(filme);
        }
    }
}
