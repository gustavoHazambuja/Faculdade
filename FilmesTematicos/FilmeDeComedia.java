public class FilmeDeComedia extends Filme {
    
    private String tipoComedia;

    public FilmeDeComedia(String titulo, int ano, int duracao, String diretor, double bilheteria, double orcamento, String tipo){
        super(titulo, ano, duracao, diretor, bilheteria, orcamento);
        this.tipoComedia = tipo;
    }

    public String getTipoComedia() {
        return tipoComedia;
    }

    @Override
    public String toString(){
        return String.format("\n[Filme de Comédia]" + "\n" + 
        super.toString() + "Tipo de comédia: %s\n", tipoComedia);
    }
}

