package ex3;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor antigo: " + (this.saldo-valor) + " | Valor novo: " + this.saldo);
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito no valor de: " + valor);
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
}
