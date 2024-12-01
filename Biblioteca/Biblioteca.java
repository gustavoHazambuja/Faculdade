import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Biblioteca {

    // Mapear isbn:String -> Livro
    private HashMap<String, Livro> livros;

    public Biblioteca(){
        this.livros = new HashMap<String, Livro>();
    }

    public void adicionarLivro(Livro livro){
        livros.put(livro.getIsbn(), livro);
    }

    public void removerLivroPorIsbn(String isbn){
       livros.remove(isbn);
    }

    public boolean contem(String isbn){
        return livros.containsKey(isbn);
    }

    public List<Livro> procurarPorTitulo(String stringBusca){
        List<Livro> livrosEncontrados = new ArrayList<Livro>();

        // Percorre o livro
        for(Livro l: livros.values()){
            if(l.getTitulo().contains(stringBusca)){
                livrosEncontrados.add(l);
            }
        }
        System.out.println("Livros encontrados: ");
        return livrosEncontrados;
    }

    public List<Livro> procurarPorAutor(String stringDeBusca){
        List<Livro> autoresEncontrados = new ArrayList<>();

        for(Livro l: livros.values()){
            if(l.getAutor().contains(stringDeBusca)){
                autoresEncontrados.add(l);
            }
        }

        return autoresEncontrados;
    }

    public List<Livro> livrosOrdenadosPorAno(){
        List<Livro> livro = new ArrayList<>();

        livro.addAll(livros.values());
        Collections.sort(livro);

        return livro;
    }

    public boolean emprestarLivro(String isbn){
        Livro livroProcurado = livros.get(isbn);
        if(livroProcurado == null){
            return false;
        }

        boolean livroJaEmprestado = livroProcurado.estaEmprestado();

        if(livroJaEmprestado){
            return false;
        }
        else{
            livroProcurado.tomarEmprestado();
            return true;
        }
    }

    public boolean devolverLivro(String isbn){
       Livro livrProcurado = livros.get(isbn);
        if(livrProcurado == null){
            return false;
        }

        livrProcurado.devolver();
        return true;
    
    }
    
    
    
}
