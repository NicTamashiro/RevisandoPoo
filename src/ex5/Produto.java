package ex5;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco <= 0){
            System.out.println("Preco invalido.");
        } else {
            this.preco = preco;
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
