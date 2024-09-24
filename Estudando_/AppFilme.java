import java.util.*;

public class AppFilme
{
    public ListaFilmes listafilmes;
    
    public AppFilme(){
        this.listafilmes = new ListaFilmes();
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        AppFilme app = new AppFilme();
        
        int opcao;
        
        do{
            System.out.println("******************");
            System.out.println("Menu interativo: ");
            System.out.println("******************");
            
            System.out.println("(1) Cadastrar filme" );
            System.out.println("(2) Listar filmes" );
            System.out.println("(3) Buscar filme por nome" );
            System.out.println("(4) Buscar filme por diretor" );
            System.out.println("(5) Buscar filme por gênero" );
            System.out.println("(6) Buscar filme por ator/atriz principal" );
            System.out.println("(7) Buscar filme por ano de lançamento" );
            System.out.println("(8) Sair" );
            opcao = dados.nextInt();
            dados.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome do filme: ");
                    String nome = dados.nextLine();
                    System.out.println("Informe o diretor do filme: ");
                    String diretor = dados.nextLine();
                    System.out.println("Informe o gênero do filme: ");
                    String genero = dados.nextLine();
                    System.out.println("Informe o ator/atriz principal do filme: ");
                    String atorPrincipal = dados.nextLine();
                    System.out.println("Informe o ano de lançamento do filme: ");
                    int anoLancamento = dados.nextInt();
                    Filme novoFilme = new Filme(nome,anoLancamento,diretor,genero,atorPrincipal);
                    app.listafilmes.cadastrarFilme(novoFilme);
                    break;
                    
                case 2:
                    System.out.println("Lista de filmes: ");
                    app.listafilmes.listarFilmes();
                    break;
                    
                case 3:
                    System.out.println("Informe o nome do filme: ");
                    nome = dados.nextLine();
                    Filme filmeEncontrado = app.listafilmes.buscarFilmePorNome(nome);
                    if(filmeEncontrado != null){
                        System.out.println("Filme encontrado: " + filmeEncontrado); 
                    }else{
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Informe o diretor do filme: ");
                    diretor = dados.nextLine();
                    filmeEncontrado = app.listafilmes.buscarFilmePorDiretor(diretor);
                    if(filmeEncontrado != null){
                        System.out.println("Filme encontrado: " + filmeEncontrado); 
                    }else{
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Informe o gênero do filme: ");
                    genero = dados.nextLine();
                    filmeEncontrado = app.listafilmes.buscarFilmePorGenero(genero);
                    if(filmeEncontrado != null){
                        System.out.println("Filme encontrado: " + filmeEncontrado); 
                    }else{
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                    
                case 6:
                    System.out.println("Informe o ator/atriz principal do filme: ");
                    atorPrincipal = dados.nextLine();
                    filmeEncontrado = app.listafilmes.buscarFilmePorAtorPrincipal(atorPrincipal);
                    if(filmeEncontrado != null){
                        System.out.println("Filme encontrado: " + filmeEncontrado); 
                    }else{
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                    
                case 7:
                    System.out.println("Informe o ano de lançamento do filme: ");
                    anoLancamento = dados.nextInt();
                    filmeEncontrado = app.listafilmes.buscarFilmePorAnoLancamento(anoLancamento);
                    if(filmeEncontrado != null){
                        System.out.println("Filme encontrado: " + filmeEncontrado); 
                    }else{
                        System.out.println("Filme não encontrado!");
                    }
                    break;
                    
                case 8:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! ");
                    break;
                    
                    
                    
            }            
        }while(opcao !=8);
    }   
}
