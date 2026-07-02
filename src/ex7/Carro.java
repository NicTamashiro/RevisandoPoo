package ex7;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int velocidade;

    public Carro(String marca, String modelo, String cor, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public void acelerar(int quilometros){
        if(quilometros <= 0){
            System.out.println("Valor invalido");
        } else {
            this.velocidade += quilometros;
            System.out.println("Nova velocidade: " + velocidade);
        }
    }

    public void frear(int quilometros){
        if(quilometros <= 0){
            System.out.println("Valor invalido");
        } else if(velocidade-quilometros < 0){
            System.out.println("A velocidade nao pode ficar negativa");
        } else {
            this.velocidade -= quilometros;
            System.out.println("Nova velocidade: " + velocidade);
        }
    }

    public void parar(){
        this.velocidade = 0;
        System.out.println("Seu carro esta parado.");
    }

    public void exibeInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
    }
}
