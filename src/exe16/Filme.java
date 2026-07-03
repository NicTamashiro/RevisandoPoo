package exe16;

public class Filme {
    private String titulo;
    private double notaIMDB;

    public Filme(){
        this.titulo = "Sem titulo";
        this.notaIMDB = 0.0;
    }

    public Filme(String titulo, double notaIMDB){
        this.titulo = titulo;
        this.notaIMDB = notaIMDB;
    }

    @Override
    public String toString() {
        return titulo + " (nota: " + notaIMDB + ")";
    }
}
