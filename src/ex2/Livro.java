package ex2;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if(this.disponivel == false){
            System.out.println("Livro indisponivel.");
        } else {
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        }
    }
}
