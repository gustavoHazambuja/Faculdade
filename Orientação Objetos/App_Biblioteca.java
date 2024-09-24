

public class App_Biblioteca
{
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Livro livro1 = new Livro("Livro A", "Autor A", 1);
        Livro livro2 = new Livro("Livro B", "Autor B", 2);

        Usuario usuario = new Usuario("João", 1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarUsuario(usuario);

        biblioteca.exibirLivrosDisponiveis();

        usuario.emprestarLivro(livro1);
        biblioteca.exibirLivrosDisponiveis();

        usuario.devolverLivro(livro1);
        biblioteca.exibirLivrosDisponiveis();
    }
    

    
}
