import java.util.*;

public class ListaLivros
{
    private List<Livro> livros;
    
    public ListaLivros(){
        this.livros = new ArrayList<>();
    }
    
    public void cadastrarLivro(Livro livro){
        for(Livro l: livros){
            if(l.getCodigo() == (livro.getCodigo())){
                System.out.println("Livro com o mesmo código já cadastrado! ");
                return;
            }
        }
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso! ");
        
    }
    
    public void removerLivroPorCodigo(int codigo){
        Livro livroParaRemover = null;
        for(Livro l:livros){
            if(l.getCodigo() == (codigo)){
                livroParaRemover = l;
                break;
            }
        }
        if(livroParaRemover != null){
           livros.remove(livroParaRemover);
           System.out.println("Livro removido com sucesso!");
        }else{
            System.out.println("Erro! Livro com este código não cadastrado");
        } 
    }
    
    public Livro buscarLivroPorCodigo(int codigo){
        for(Livro l:livros){
            if(l.getCodigo() == (codigo)){
                return l;
            }
        }
        System.out.println("Livro com esse código não cadastrado! ");
        return null;
    }
    
    public Livro buscarLivroPorAutor(String autor){
        for(Livro l:livros){
            if(l.getAutor().equals(autor)){
                return l;
            }
        }
        System.out.println("Livro com esse autor não cadastrado! ");
        return null;
    }
    
    public Livro buscarLivroPorAnoPublicacao(int anoPublicacao){
        for(Livro l:livros){
            if(l.getAnoPublicacao() == (anoPublicacao)){
                return l;
            }
        }
        System.out.println("Livro com esse ano não cadastrado! ");
        return null;
    }
    
    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado! ");
        }else{
          for(Livro l:livros){
            System.out.println(l);
          }
        }
        
    }
}

   

