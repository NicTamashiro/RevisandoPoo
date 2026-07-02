package ex13;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Agua", 5);

        FormaPagamento pagamento1 = new PagamentoCartao();

        double valorFinal1 = pagamento1.calcularValorFinal(produto1.getPreco());

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Valor final: " + valorFinal1);

        System.out.println("-----------------------------------");

        Produto produto2 = new Produto("Agua", 5);

        FormaPagamento pagamento2 = new PagamentoDinheiro();

        double valorFinal2 = pagamento2.calcularValorFinal(produto1.getPreco());

        System.out.println("Produto: " + produto2.getNome());
        System.out.println("Valor final: " + valorFinal2);
    }
}
