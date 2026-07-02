package ex1;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Coraline", "Neil Gaiman", 224, true);
        Livro livro2 = new Livro("O Diario de Anne Frank", "Anne Frank", 352, false);

        livro1.exibeLivro();
        System.out.println("------------------------------");
        livro2.exibeLivro();

    }
}
