package ex13;

public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


}
