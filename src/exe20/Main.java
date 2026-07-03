package exe20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 10));
        produtos.add(new Produto("Feijao", 9));
        produtos.add(new Produto("Bolo", 15));
        produtos.add(new Produto("Macarrao", 12));
        produtos.add(new Produto("Coca-Cola", 6));

        System.out.println("=== Antes da Ordenacao ===");
        for (Produto produto : produtos){
            System.out.println(produto);
        }

        System.out.println("--------------------------");
        System.out.println("=== Depois da Ordenacao ===");
        Collections.sort(produtos);

        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
