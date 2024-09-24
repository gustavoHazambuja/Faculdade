import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//== import java.util.*;

public class AppLivro
{
    private ListaLivro listaLivros;
    
    public AppLivro(){
        this.listaLivros = new ListaLivro();
    }
    
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        String codigo;
        String titulo;
        int anoPublicacao;
        List<String> autores;
        
        AppLivro app = new AppLivro();
        
        int opcao;
        
        do{
          System.out.println("*******************");
          System.out.println("Menu interativo: ");
          System.out.println("*******************");
         
          System.out.println("(1) Cadastrar livro ");
          System.out.println("(2) Buscar livro por código ");
          System.out.println("(3) Buscar livro por autor ");
          System.out.println("(4) Excluir livro por código ");
          System.out.println("(5) Listar livros " );
          System.out.println("(6) Sair " );
          opcao = dados.nextInt();
          dados.nextLine();
        
        switch(opcao){
            case 1:
               System.out.println("Informe o código do livro: ");
               codigo = dados.nextLine();
               System.out.println("Informe o titulo do livro: ");
               titulo = dados.nextLine();
               System.out.println("Informe o ano de publicação do livro: ");
               anoPublicacao = dados.nextInt();
               dados.nextLine();
               System.out.println("Informe os autores do livro (separados por vírgula): ");
               String[] autoresArray = dados.nextLine().split(", ");
               autores = new ArrayList<>();
               for(String autor : autoresArray){
                   autores.add(autor);
               }
                Livro livro = new Livro(codigo, titulo, anoPublicacao, autores);
                app.listaLivros.cadastrarLivro(livro);
                break;
           
            case 2:
                System.out.println("Informe o código do livro que deseja buscar:");
                codigo = dados.nextLine();
                Livro livroEncontrado = app.listaLivros.buscarLivroPorCodigo(codigo);
                if (livroEncontrado != null){
                    System.out.println("Livro encontrado: " + livroEncontrado);
                }else{
                    System.out.println("Livro não encontrado.");
                }
                break;
              
            case 3:
                System.out.println("Informe o nome do autor que deseja buscar:");
                String autorBusca = dados.nextLine();
                 List<Livro> livrosEncontrados = app.listaLivros.buscarLivroPorAutor(autorBusca);
                if (!livrosEncontrados.isEmpty()) {
                    for(Livro l : livrosEncontrados) {
                        System.out.println(l);
                    }
                }else{
                    System.out.println("Nenhum livro encontrado para este autor.");
                }
                break;
            
            case 4:
                System.out.println("Informe o código do livro a ser excluído:");
                codigo = dados.nextLine();
                app.listaLivros.excluirLivroPorCodigo(codigo);
                break;
             
             case 5:
                System.out.println("Lista de livros: ");
                System.out.println(app.listaLivros);
                break;
                
            case 6:
                System.out.println("Saindo...");
                break;
            
            default:
                System.out.println("Opção inválida! ");
                break;
        }
        
    }while(opcao !=6);
       
    }
}
