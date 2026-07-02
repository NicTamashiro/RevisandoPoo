package ex12;

public class ClienteComum implements Desconto{
    private double valorOriginal;

    public ClienteComum(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    @Override
    public void aplicarDesconto(){
        System.out.println("Valor: " + valorOriginal*0.95);
    }
}
