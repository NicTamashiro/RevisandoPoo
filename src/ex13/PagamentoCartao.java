package ex13;

public class PagamentoCartao implements FormaPagamento{

    @Override
    public double calcularValorFinal(double valor){
        return valor * 1.03;
    }
}
