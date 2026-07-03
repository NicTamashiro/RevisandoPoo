package exe18;

public class Midia {
    private String titulo;
    private int anoLancamento;

    public Midia(String titulo, int anoLancamento){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " (Ano Lancamento: " + anoLancamento + " )";
    }
}
