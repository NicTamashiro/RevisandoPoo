package exe17;

public class Serie extends Midia{
    private int numeroTemporadas;

    public Serie(String titulo, int anoLancamento, int numeroTemporadas){
        super(titulo, anoLancamento);
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " (Ano Lancamento: " + getAnoLancamento() + ")" + "(Temporadas: " + numeroTemporadas + ")";
    }
}
