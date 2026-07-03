package exe16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme());
        filmes.add(new Filme("Matrix", 8.5));

        for (Filme filme : filmes){
            System.out.println(filme);
        }
    }
}
