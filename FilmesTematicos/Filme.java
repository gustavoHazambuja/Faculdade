public abstract class Filme{

    private String titulo;
    private int anoLancamento;
    private int duracao; // Em minutos
    private String diretor;
    private double bilheteria;
    private double orcamento;

    public Filme(String titulo, int ano, int duracao, String diretor, double bilheteria, double orcamento){
        this.titulo = titulo;
        this.anoLancamento = ano;
        this.duracao = duracao;
        this.diretor = diretor;
        this.bilheteria = bilheteria;
        this.orcamento = orcamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public double getBilheteria() {
        return bilheteria;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String toString(){
        return String.format("Título: %s\n" +
        "Ano de lançamento: %d\n" +
        "Diretor: %s\n" +
        "Duração: %d" + " minutos\n" +
        "Bilheteria: %.2f\n" +
        "Orçamento: %.2f" + " milhões de dólares\n",
         titulo,anoLancamento,diretor,duracao,bilheteria,orcamento);
    }
    
}