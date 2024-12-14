public class FilmeDeAnimacao extends Filme {

    private String tipoAnimacao;

    public FilmeDeAnimacao(String titulo, int ano, int duracao, String diretor, double bilheteria, double orcamento, String tipo){
        super(titulo, ano, duracao, diretor, bilheteria, orcamento);
        this.tipoAnimacao = tipo;
    }

    public String getTipoAnimacao() {
        return tipoAnimacao;
    }

    @Override
    public String toString(){
        return String.format("\n[Filme de Animação]" + "\n" + 
        super.toString() + "Tipo da animação %s\n", tipoAnimacao);
    }
    
}
