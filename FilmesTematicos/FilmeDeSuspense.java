public class FilmeDeSuspense extends Filme {
    
    private double nivelTensao; // 0 a 10

    public FilmeDeSuspense(String titulo, int ano, int duracao, String diretor, double bilheteria, double orcamento, double nivel){
        super(titulo, ano, duracao, diretor, bilheteria, orcamento);
        this.nivelTensao = nivel;
    }

    public double getNivelTensao() {
        return nivelTensao;
    }

    @Override
    public String toString(){
        return String.format("\n[Filme de Suspense]" + "\n" + 
        super.toString() + "Nível de tensão: %.2f\n", nivelTensao);
    }
}
