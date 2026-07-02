package ex7;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Hyundai", "HB20", "Branco", 50);
        Carro carro2 = new Carro("Hyundai", "Creta", "Preto", 100);

        carro1.exibeInformacoes();
        System.out.println("---------------------");
        carro2.exibeInformacoes();

        System.out.println();

        carro1.acelerar(50);
        carro1.frear(10);
        carro1.parar();
        carro1.exibeInformacoes();

        System.out.println("---------------------");

        carro2.acelerar(50);
        carro2.frear(10);
        carro2.parar();
        carro2.exibeInformacoes();

    }
}
