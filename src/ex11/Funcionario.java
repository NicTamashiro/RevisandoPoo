package ex11;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }
}
