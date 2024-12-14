import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CatalagoFilmes {
    
    private Set<Filme> filmes;

    public CatalagoFilmes(){
        this.filmes = new HashSet<Filme>();
    }

    public int qtdFilmes(){
        return filmes.size();
    }

    public void cadastrarFilmes(Filme f){
        filmes.add(f);
    }

    public List<Filme> listarFilmes(){
        return filmes.stream()
            .collect(Collectors.toList());
    }

    public int qtdFilmesAcao(){
        return (int) filmes.stream()
            .filter(f -> f instanceof FilmeDeAcao)
            .count();
    }

    public int qtdFilmesComedia(){
        return (int) filmes.stream()
            .filter (f -> f instanceof FilmeDeComedia)
            .count();
    }

    public int qtdFilmesSuspense(){
        return (int) filmes.stream()
            .filter (f -> f instanceof FilmeDeSuspense)
            .count();
    }

    public int qtdFilmesAnimacao(){
        return (int) filmes.stream()
            .filter (f -> f instanceof FilmeDeAnimacao)
            .count();
    }

    public double somaBilheteria(){
        return filmes.stream()
            .mapToDouble(Filme::getBilheteria)
            .sum();
    }

    public double mediaDuracao(){
        return filmes.stream()
            .mapToDouble(Filme::getDuracao)
            .average()
            .orElse(-1);
    }

    public String maiorBilheteria(){
        return filmes.stream()
            .max(Comparator.comparing(Filme::getBilheteria))
            .map(f -> "Título: " + f.getTitulo() + ", Bilheteria: " + f.getBilheteria())
            .orElse("Nenhum filme encontrado");       
    }

    public String menorBilheteria(){
        return filmes.stream()
            .min(Comparator.comparing(Filme::getBilheteria))
            .map(f -> "Título: " + f.getTitulo() + ", Bilheteria: " + f.getBilheteria())
            .orElse("Nenhum filme encontrado");   
    }

    public String maiorOrcamento(){
        return filmes.stream()
            .max(Comparator.comparing(Filme::getOrcamento))
            .map(f -> "Título: " + f.getTitulo() + ", Orçamento: " + f.getOrcamento())
            .orElse("Nenhum filme encontrado");
    }

    public String menorOrcamento(){
        return filmes.stream()
            .min(Comparator.comparing(Filme::getOrcamento))
            .map(f -> "Título: " + f.getTitulo() + ", Orçamento: " + f.getOrcamento())
            .orElse("Nenhum filme encontrado");
    }

    public String filmesMaisAntigo(){
        return filmes.stream()
            .min(Comparator.comparing(Filme::getAnoLancamento))
            .map(f -> "Título: " + f.getTitulo() + ", Ano de lançamento: " + f.getAnoLancamento())
            .orElse("Nenhum filme encontrado");
    }

    public String filmeMaisNovo(){
        return filmes.stream()
            .max(Comparator.comparing(Filme::getAnoLancamento))
            .map(f -> "Título: " + f.getTitulo() + ", Ano de lançamento: " + f.getAnoLancamento())
            .orElse("Nenhum filme encontrado");

    }

    public List<Filme> filmesMais1Bi(){
        return filmes.stream()  
            .filter(f -> f.getBilheteria() > 1000000000)
            .collect(Collectors.toList());
    }

    public List<Filme> filmesMenos500Mi(){
        return filmes.stream()
            .filter(f -> f.getBilheteria() < 500000000)
            .collect(Collectors.toList());
    }

    public Filme pesquisarFilme(String titulo){
        return filmes.stream()
            .filter(f -> f.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
            .findFirst()
            .orElse(null);


    }

    
}
