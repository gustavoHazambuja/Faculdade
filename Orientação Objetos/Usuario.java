import java.util.List;
import java.util.ArrayList;




public class Usuario
{
    private String nome;
    private int id;
    private ArrayList<Livro>livrosEmprestados;
    
    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void emprestarLivro(Livro livro){
        if(livro.getDisponivel()){
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
        }else{
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo! " );
        }
        
    }
    public void devolverLivro(Livro livro){
        if(livrosEmprestados.remove(livro)){
            livro.setDisponivel(true);
        }else{
            System.out.println("O livro " + livro.getTitulo() + " não está na lista de empréstimos!");
        }
        
    }
    public void exibirLivrosEmprestados(){
        if(livrosEmprestados.isEmpty()){
            System.out.println("Livros emprestados: ");
            for(Livro livro : livrosEmprestados){
                System.out.println("- " + livro.getTitulo());
            }
        }else{
            System.out.println("Nenhum livro emprestado no momento. ");
        }
    }
   
    
    
    
    
    

    
}
