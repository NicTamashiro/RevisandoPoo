package ex5;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Agua");
        produto1.setPreco(5.50);
        produto1.setQuantidadeEstoque(10);
        produto2.setNome("Arroz");
        produto2.setPreco(10.00);
        produto2.setQuantidadeEstoque(5);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preco: R$ " + produto1.getPreco());
        System.out.println("Quantidade no estoque: " + produto1.getQuantidadeEstoque());
        System.out.println("----------------------------");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preco: R$ " + produto2.getPreco());
        System.out.println("Quantidade no estoque: " + produto2.getQuantidadeEstoque());
    }
}
