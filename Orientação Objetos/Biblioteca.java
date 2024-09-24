import java.util.List;
import java.util.ArrayList;


public class Biblioteca
{
    private String nome;
    private List<Livro>livros;
    private List<Usuario>usuarios;
    
    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }
    
    public void exibirLivrosDisponiveis(){
        boolean temLivrosDisponiveis = false;
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.getDisponivel()) {
                System.out.println("- " + livro.getTitulo());
                temLivrosDisponiveis = true;
            }
        }
        if (temLivrosDisponiveis) {
            System.out.println("Nenhum livro disponível no momento.");
        }
    }
    
    
    

    
}
