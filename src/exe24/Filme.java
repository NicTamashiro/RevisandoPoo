package exe24;

import java.util.List;

public class Filme implements Comparable<Filme>{
    private String titulo;
    private List<String> generos;
    private double notaIMDB;

    public Filme(String titulo, List<String> generos, double notaIMDB) {
        this.titulo = titulo;
        this.generos = generos;
        this.notaIMDB = notaIMDB;
    }

    @Override
    public int compareTo(Filme outroFilme){
        return Double.compare(this.notaIMDB, outroFilme.notaIMDB);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getGenero() {
        return generos;
    }

    public double getNotaIMDB() {
        return notaIMDB;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "titulo='" + titulo + '\'' +
                ", genero='" + generos + '\'' +
                ", notaIMDB=" + notaIMDB +
                '}';
    }
}
