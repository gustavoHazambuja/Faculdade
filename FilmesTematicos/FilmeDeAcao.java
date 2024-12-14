public class FilmeDeAcao extends Filme {
    
    private int qtdCenasAcao;

    public FilmeDeAcao(String titulo, int ano, int duracao, String diretor, double bilheteria, double orcamento, int cenas){
        super(titulo, ano, duracao, diretor, bilheteria, orcamento);
        this.qtdCenasAcao = cenas;
    }

    public int getQtdCenasAcao() {
        return qtdCenasAcao;
    }

    @Override
    public String toString(){
        return String.format("\n[Filme de Ação]" + "\n" + 
        super.toString() + "Quantidade de cenas de ação: %d\n", qtdCenasAcao);
    }
}
