import java.util.*;


public class ListaFilmes
{
    private List<Filme> filmes;
    
    public ListaFilmes(){
        this.filmes = new ArrayList<>();
    }
    
    public void cadastrarFilme(Filme filme){
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }
    
    public Filme buscarFilmePorNome(String nome){
        for(Filme f:filmes){
            if(f.getNome().equals(nome)){
                return f;
            }
        }
        System.out.println("Filme com esse nome não encontrado!");
        return null;
    }
    
    public Filme buscarFilmePorDiretor(String diretor){
        for(Filme f:filmes){
            if(f.getDiretor().equals(diretor)){
                return f;
            }
        }
        System.out.println("Filme com esse diretor não encontrado!");
        return null;
    }
    
    public Filme buscarFilmePorGenero(String genero){
        for(Filme f:filmes){
            if(f.getGenero().equals(genero)){
                return f;
            }
        }
        System.out.println("Filme com esse gênero não encontrado!");
        return null;
    }
    
    public Filme buscarFilmePorAtorPrincipal(String atorPrincipal){
        for(Filme f:filmes){
            if(f.getAtorPrincipal().equals(atorPrincipal)){
                return f;
            }
        }
        System.out.println("Filme com esse ator/atriz não encontrado!");
        return null;
    }
    
    public Filme buscarFilmePorAnoLancamento(int anoLancamento){
        for(Filme f:filmes){
            if(f.getAnoLancamento() == (anoLancamento)){
                return f;
            }
        }
        System.out.println("Filme com esse ano não encontrado!" );
        return null;
    }
    
    public void listarFilmes(){
        if(filmes.isEmpty()){
            System.out.println("Nenhum filme cadastrado! ");
        }else{
            for(Filme f:filmes){
                System.out.println(f);
            }
        }
    }
   

}
