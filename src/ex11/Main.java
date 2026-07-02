package ex11;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", 5000);
        Gerente gerente1 = new Gerente("Nicolas", 5000);

        System.out.println("Salario funcionario: " + funcionario1.calcularSalario());
        System.out.println("Salario gerente: " + gerente1.calcularSalario());

    }
}
