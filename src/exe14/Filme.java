package exe14;

public class Filme {
    private String titulo;
    private double notaIMDB;

    public Filme(String titulo, double notaIMDB){
        this.titulo = titulo;
        this.notaIMDB = notaIMDB;
    }

    @Override
    public String toString() {
        return titulo + " (nota:" + notaIMDB + ")";
    }
}
