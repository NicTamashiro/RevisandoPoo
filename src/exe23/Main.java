package exe23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 10));
        produtos.add(new Produto("Feijao", 9));
        produtos.add(new Produto("Bolo", 15));
        produtos.add(new Produto("Macarrao", 12));
        produtos.add(new Produto("Coca-Cola", 6));

        System.out.println("=== Ordenacao em ORDEM ALFABETICA ===");
        produtos.sort(Comparator.comparing(Produto::getNome));

        for (Produto produto : produtos){
            System.out.println(produto);
        }

        System.out.println("-----------------------------------");

        System.out.println("=== Ordenacao por PRECO ===");
        produtos.sort(Comparator.comparingDouble(Produto::getPreco));

        for (Produto produto : produtos){
            System.out.println(produto);
        }

        System.out.println("-----------------------------------");

        System.out.println("=== Ordenacao por PRECO DECRESCENTE ===");
        produtos.sort(Comparator.comparingDouble(Produto::getPreco).reversed());

        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
