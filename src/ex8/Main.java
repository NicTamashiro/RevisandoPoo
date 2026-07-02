package ex8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Nicolas", List.of(8.0,7.0,9.0));
        Aluno aluno2 = new Aluno("Pedro", List.of(2.0,3.0,7.0));

        aluno1.foiAprovado();
        aluno2.foiAprovado();
    }
}
