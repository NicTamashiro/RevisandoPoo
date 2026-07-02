package ex8;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome, List<Double> notas){
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for(Double nota : notas){
            soma += nota;
        }
        return soma / notas.size();
    }

    public boolean foiAprovado(){
        if(calcularMedia() >= 6){
            System.out.println("Apovado");
            return true;
        } else {
            System.out.println("Reprovado");
            return false;
        }
    }
}
