package exe24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Filme> catalogo = new LinkedList<>();

        catalogo.add(new Filme("The Shawshank Redemption", "Drama", 9.3));
        catalogo.add(new Filme("The Dark Knight", "Ação, Crime", 9.0));
        catalogo.add(new Filme("Inception", "Ficção científica, Ação", 8.8));
        catalogo.add(new Filme("Forrest Gump", "Drama, Romance", 8.8));
        catalogo.add(new Filme("Interstellar", "Ficção científica, Aventura", 8.7));
        catalogo.add(new Filme("The Matrix", "Ficção científica, Ação", 8.7));

        System.out.println("===== Catalogo de Filmes =====");

        Collections.sort(catalogo);
        for (Filme filme : catalogo){
            System.out.println(filme);
        }

        System.out.println("------------------------------------");

        catalogo.sort(Comparator.comparing(Filme::getTitulo));

        for (Filme filme : catalogo){
            System.out.println(filme);
        }

        System.out.println("------------------------------------");

        for (Filme filme : catalogo){
            if(filme.getGenero().toLowerCase().contains("ficção científica")){
                System.out.println(filme);
            }
        }
    }
}
