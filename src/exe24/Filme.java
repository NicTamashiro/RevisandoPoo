package exe24;

public class Filme implements Comparable<Filme>{
    private String titulo;
    private String genero;
    private double notaIMDB;

    public Filme(String titulo, String genero, double notaIMDB) {
        this.titulo = titulo;
        this.genero = genero;
        this.notaIMDB = notaIMDB;
    }

    @Override
    public int compareTo(Filme outroFilme){
        return Double.compare(this.notaIMDB, outroFilme.notaIMDB);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getNotaIMDB() {
        return notaIMDB;
    }

    @Override
    public String toString() {
        return "Filme {" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", notaIMDB=" + notaIMDB +
                '}';
    }
}
