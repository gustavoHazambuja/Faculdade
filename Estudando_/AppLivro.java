import java.util.*;

public class AppLivro
{
    
    private ListaLivros listalivros;
    
    public AppLivro(){
        this.listalivros = new ListaLivros();
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        AppLivro app = new AppLivro();
        
        int opcao;
        
        do{
            System.out.println("******************");
            System.out.println("Menu interativo: ");
            System.out.println("******************");
            
            System.out.println("(1) Cadastrar livro" );
            System.out.println("(2) Remover livro" );
            System.out.println("(3) Listar livros" );
            System.out.println("(4) Buscar livro por código" );
            System.out.println("(5) Buscar livro por autor" );
            System.out.println("(6) Buscar livro por ano de publicação" );
            System.out.println("(7) Sair" );
            opcao = dados.nextInt();
            dados.nextLine();
            
            switch(opcao){
                
                case 1:
                    System.out.println("Informe o nome do livro: ");
                    String nome = dados.nextLine();
                    System.out.println("Informe o autor do livro: ");
                    String autor = dados.nextLine();
                    System.out.println("Informe o código do livro: ");
                    int codigo = dados.nextInt();
                    System.out.println("Informe o ano de publicação do livro: ");
                    int anoPublicacao = dados.nextInt();
                    Livro novoLivro = new Livro(nome,codigo,autor,anoPublicacao);
                    app.listalivros.cadastrarLivro(novoLivro);
                    break;
                    
                case 2:
                    System.out.println("Informe o código do livro para remover: ");
                    codigo = dados.nextInt();
                    Livro livroEncontrado = app.listalivros.buscarLivroPorCodigo(codigo);
                    if(livroEncontrado != null){
                        System.out.println("Livro encontrado: " + livroEncontrado);
                        app.listalivros.removerLivroPorCodigo(codigo);
                        
                    }else{
                        System.out.println("Livro não encontrado! ");
                    }
                    
                case 3:
                    System.out.println("Lista de livros: ");
                    app.listalivros.listarLivros();
                    break;
                    
                case 4:
                    System.out.println("Informe o código do livro: ");
                    codigo = dados.nextInt();
                    livroEncontrado = app.listalivros.buscarLivroPorCodigo(codigo);
                    if(livroEncontrado != null){
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    }else{
                        System.out.println("Livro não encontrado! ");
                    }
                    break;
                    
                case 5:
                    System.out.println("Informe o autor do livro: ");
                    autor = dados.nextLine();
                    livroEncontrado = app.listalivros.buscarLivroPorAutor(autor);
                    if(livroEncontrado != null){
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    }else{
                        System.out.println("Livro não encontrado! ");
                    }
                    break;
                    
                case 6:
                    System.out.println("Informe o ano de publicação do livro: ");
                    anoPublicacao = dados.nextInt();
                    livroEncontrado = app.listalivros.buscarLivroPorAnoPublicacao(anoPublicacao);
                    if(livroEncontrado != null){
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    }else{
                        System.out.println("Livro não encontrado! ");
                    }
                    break;
                    
                case 7:
                    System.out.println("Saindo... ");
                    break;
                    
                default:
                    System.out.println("Opção inválida! ");
                    break;
            }
            
            
        }while(opcao != 7);
        
        
        
    }
    

   
}
