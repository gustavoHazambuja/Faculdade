import java.util.List;
import java.util.ArrayList;

public class ListaLivro
{
   private List<Livro> livros;
  
  
    //Construtor
  public ListaLivro(){
     this.livros = new ArrayList<>();
  }
    
  public void cadastrarLivro(Livro livro){
      for (Livro l : livros){//Interaje cada objeto'Livro' contido na lista 'livros'
          //Percorre o array
          if(l.getCodigo().equals(livro.getCodigo())){//Não permite livros com o mesmo código
              System.out.println("Erro: Já existe um livro com esse código cadastrado! ");
              return;
          }
      }
      livros.add(livro);
      System.out.println("Livro cadastrado com sucesso! ");
  }
  
  public Livro buscarLivroPorCodigo(String codigo){
      for(Livro l : livros){
          if(l.getCodigo().equals(codigo)){
              return l;
          }
      }
      return null;
  }
  
  public List<Livro> buscarLivroPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        for (Livro l : livros) {
            if (l.getAutores().contains(autor)) {
                livrosAutor.add(l);
            }
        }
        return livrosAutor;
    }
    
     public void excluirLivroPorCodigo(String codigo){
        Livro livroParaRemover = null;
        for (Livro l : livros){
            if (l.getCodigo().equals(codigo)){
                livroParaRemover = l;
                break;
            }
        }
        if (livroParaRemover != null){
            livros.remove(livroParaRemover);
            System.out.println("Livro excluído com sucesso.");
        }else{
            System.out.println("Erro: Livro com este código não encontrado.");
        }
    }
    
       public String toString(){
        if(livros.isEmpty()){
            return "Nenhum livro cadastrado.";
        }
        StringBuilder sb = new StringBuilder();
        for(Livro l : livros){
            sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }
}
   
