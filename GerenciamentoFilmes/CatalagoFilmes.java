import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;


public class CatalagoFilmes {
 
    private HashMap<String, Filme> filmes;

    public CatalagoFilmes(){
        this.filmes = new HashMap<String, Filme>();
    }

    public void adicionarFilme(Filme filme){
        filmes.put(filme.getCodigo(), filme);
    }

    public void removerFilmePorCodigo(String codigo){
        filmes.remove(codigo);
    }

    public List<Filme> procurarPorTitulo(String titulo){
       List<Filme> filmesEncontrados = new ArrayList<>();

       for(Filme f: filmes.values()){
        if(f.getTitulo().contains(titulo));
        filmesEncontrados.add(f);
       }

       System.out.println("Filmes encontrados: ");
       return filmesEncontrados;
    }

    public List<Filme> procurarPorDiretor(String diretor){
        List<Filme> diretoresEncontrados = new ArrayList<>();

        for(Filme f: filmes.values()){
            if(f.getDiretor().contains(diretor));
            diretoresEncontrados.add(f);
        }

        System.out.println("Filmes encontrados: ");
        return diretoresEncontrados;
    }

    public List<Filme> procurarPorGenero(String genero){
        List<Filme> filmesEncontrados = new ArrayList<>();

        for(Filme f: filmes.values()){
            if(f.getGenero().contains(genero)){
                filmesEncontrados.add(f);
            }
        }

        System.out.println("Filmes encontrados: ");
        return filmesEncontrados;
    }

    public List<Filme> listarFilmesOrdenadosPoAno(){
        List<Filme> filme = new ArrayList<>();

        filme.addAll(filmes.values());
        Collections.sort(filme);

        return filme;
    }

    public boolean alugarFilme(String codigo){
        Filme filmeProcurado = filmes.get(codigo);
        if(filmeProcurado == null){
            return false;
        }

        boolean filmeJaAlugado = filmeProcurado.isAlugado();

        if(filmeJaAlugado){
            return false;
        }
        else{
            filmeProcurado.alugar();
            return true;
        }  
    }

    public boolean devolverFilme(String codigo){
        Filme filmeProcurado = filmes.get(codigo);

        if(filmeProcurado == null){
            return false;
        }

        filmeProcurado.devolver();
        return true;



    }


}
