package exe23;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.compare(this.preco, outroProduto.preco);
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " (preco: R$ " + preco + ")";
    }
}
