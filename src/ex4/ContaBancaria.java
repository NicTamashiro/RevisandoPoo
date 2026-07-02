package ex4;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Valor antigo: " + (this.saldo-valor) + " | Valor novo: " + this.saldo);
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Valor invalido.");
        }
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito no valor de: " + valor);
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
}