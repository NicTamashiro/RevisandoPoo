package ex4;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Nicolas Tamashiro", 9800);
        ContaBancaria conta2 = new ContaBancaria("Caue Nunes", 5000);

        conta1.depositar(500);
        conta1.sacar(200);
        System.out.println("-----------------------------------------");
        conta2.depositar(500);
        conta2.sacar(200);
    }
}
