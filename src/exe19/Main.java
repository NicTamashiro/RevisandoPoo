package exe19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Midia> midias = new ArrayList<>();

        midias.add(new Serie("It", 2026, 1));
        midias.add(new Serie("Teen Wolf", 2004, 6));
        midias.add(new Filme("Velozes e Furiosos", 2001, 120));
        midias.add(new Filme("Coraline", 2010, 110));

        int quantidadeSeries = 0;
        int quantidadeFilmes = 0;
        for (Midia item : midias){
            if(item instanceof Serie s){
                System.out.println("Eh uma serie com " + s.getNumeroTemporadas() + " temporadas.");
                quantidadeSeries++;
            } else if(item instanceof Filme f) {
                System.out.println("Eh um filme com " + f.getDuracaoEmMinutos() + " minutos.");
                quantidadeFilmes++;
            }
        }

        System.out.println("=== Minha Lista ===");
        System.out.println("Series: " + quantidadeSeries);
        System.out.println("Filmes: " + quantidadeFilmes);
    }
}
