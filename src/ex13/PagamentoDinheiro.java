package ex13;

public class PagamentoDinheiro implements FormaPagamento{

    @Override
    public double calcularValorFinal(double valor){
        return valor * 0.9;
    }
}
