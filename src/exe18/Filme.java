package exe18;

public class Filme extends Midia{
    private int duracaoEmMinutos;

    public Filme(String titulo, int anoLancamento, int duracaoEmMinutos){
        super(titulo, anoLancamento);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " (Ano Lancamento: " + getAnoLancamento() + ")" + "(Duracao em minutos: " + duracaoEmMinutos + ")";
    }
}
