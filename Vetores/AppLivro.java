import java.util.Scanner;

public class AppLivro
{

    private Livro[] livros;
    private int quantidade;
    
    public AppLivro(int tamanho){
        this.livros = new Livro[tamanho];
        this.quantidade = 0;
    }
    
    public void adicionarLivro(String titulo, String autor, double preco){
        if(quantidade < livros.length){
            livros[quantidade] = new Livro(titulo, autor, preco);
            quantidade++;
        }else{
            System.out.println("Erro: O vetor está cheio! ");
        }
        
    }
    
    public void listarLivros(){
        if(quantidade == 0){
            System.out.println("Vetor vazio! ");
        }else{
            for(int i = 0; i<quantidade; i++){
            System.out.println(livros[i].toString());
        }
    }
        
    }
    
    public Livro buscarLivro(String titulo){
        for(int i = 0; i<quantidade; i++){
            if(livros[i].getTitulo().equalsIgnoreCase(titulo)){
                return livros[i];
            }
            
        }
        return null;
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        String titulo;
        String autor;
        double preco;
        
        
        System.out.println("Informe o tamanho do vetor de livros: ");
        int tamanho = dados.nextInt();
        dados.nextLine();
        
        
        AppLivro app = new AppLivro(tamanho);
        
        int opcao;
        
        do{
          System.out.println("*******************");
          System.out.println("Menu interativo: ");
          System.out.println("*******************");
         
          System.out.println("(1) Adicionar livro ");
          System.out.println("(2) Listar livros ");
          System.out.println("(3) Buscar livro ");
          System.out.println("(4) Sair ");
          opcao = dados.nextInt();
          dados.nextLine();
        
        switch(opcao){
            case 1:
               if(app.quantidade<tamanho){
                   System.out.println("Informe o titulo do livro: ");
                    titulo = dados.nextLine();
                    System.out.println("Informe o autor do livro " + titulo + ": ");
                    autor = dados.nextLine();
                    System.out.println("Informe o preço do livro " + titulo + ": ");
                    preco = dados.nextDouble();
                    
                    dados.nextLine();//Qunando tem muita coisa para o prgrama ler. Não dar erro

                    
                    app.adicionarLivro(titulo,autor,preco);
               }else{
                   System.out.println("Erro: O vetor está cheio!");
               }
               break;
           
            case 2:
                 System.out.println("Lista de livros: ");
                 app.listarLivros();
                 break;
             
            case 3:
                System.out.println("Informe o título do livro que deseja buscar:");
                String tituloBusca = dados.nextLine();
                Livro livroEncontrado = app.buscarLivro(tituloBusca);
                if (livroEncontrado != null) {
                    System.out.println("Livro encontrado: " + livroEncontrado);
                }else{
                     System.out.println("Livro não encontrado.");
                }
                break;
            
            case 4:
                System.out.println("Você saiu do menu interativo");
                break;
            
            default:
                System.out.println("Opção inválida! ");
                break;
        }
        
    }while(opcao !=4);
    
  }   
}      
    


