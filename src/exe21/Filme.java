package exe21;

public class Filme implements Comparable<Filme>{
    private String titulo;
    private double notaIMDB;

    public Filme(String titulo, double notaIMDB){
        this.titulo = titulo;
        this.notaIMDB = notaIMDB;
    }

    @Override
    public int compareTo(Filme outroFilme){
        return Double.compare(outroFilme.notaIMDB, this.notaIMDB);
    }

    @Override
    public String toString() {
        return titulo + " (nota:" + notaIMDB + ")";
    }
}
