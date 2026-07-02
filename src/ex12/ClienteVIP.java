package ex12;

public class ClienteVIP implements Desconto{
    private double valorOriginal;

    public ClienteVIP(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    @Override
    public void aplicarDesconto(){
        System.out.println("Valor: " + valorOriginal*0.80);
    }
}
