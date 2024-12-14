import java.util.Scanner;

public class GerenciadorFilmes {
    public static void main(String[] args) {
        
        CatalagoFilmes catalago = new CatalagoFilmes();
        Scanner dados = new Scanner(System.in);

        // Filmes de ação
            catalago.cadastrarFilmes(new FilmeDeAcao("Vingadores: Ultimato", 2019, 181, "Anthony Russo, Joe Russo", 2797800000.0, 356000000.0, 12));
            catalago.cadastrarFilmes(new FilmeDeAcao("Jumanji: Bem-Vindo à Selva", 2017, 119, "Jake Kasdan", 962000000.0, 90000000.0, 9));
            catalago.cadastrarFilmes(new FilmeDeAcao("O Exterminador do Futuro 2: O Julgamento Final", 1991, 137, "James Cameron", 520000000.0, 102000000.0, 15));

       // Filmes de comédia
            catalago.cadastrarFilmes(new FilmeDeComedia("O Todo Poderoso", 2003, 101, "Tom Shadyac", 484000000.0, 81, "comédia, fantasia"));
            catalago.cadastrarFilmes(new FilmeDeComedia("Esposa de Mentirinha", 2011, 117, "Dennis Dugan", 214000000.0, 80, "comédia, romance")); 
            catalago.cadastrarFilmes(new FilmeDeComedia("Se Beber, Não Case!", 2009, 100, "Todd Phillips", 467000000.0, 35, "comédia")); 
            
       // Filmes de suspense
            catalago.cadastrarFilmes(new FilmeDeSuspense("Seven", 1995, 127, "David Fincher", 327000000.0, 33, 10));  
            catalago.cadastrarFilmes(new FilmeDeSuspense("Clube da Luta", 1999, 139, "David Fincher", 100000000.0, 63, 8)); 
            catalago.cadastrarFilmes(new FilmeDeSuspense("Os Suspeitos", 2013, 153, "Denis Villeneuve", 122000000.0, 46, 10));  
            
       // Filmes de animação
            catalago.cadastrarFilmes(new FilmeDeAnimacao("Toy Story 3", 2010, 103, "Lee Unkrich", 1067000000.0, 200, "animação, aventura"));   
            catalago.cadastrarFilmes(new FilmeDeAnimacao("Kung Fu Panda 2", 2011, 90, "Jennifer Yuh Nelson", 665000000.0, 150, "animação, aventura")); 
            catalago.cadastrarFilmes(new FilmeDeAnimacao("Meu Malvado Favorito", 2010, 95, "Pierre Coffin, Chris Renaud", 543000000.0, 69, "animação, comédia")); 
            

           System.out.println(catalago.listarFilmes());


            System.out.println("************************************");
            System.out.println("             ESTATÍSTICAS        ");
            System.out.println("************************************");
            System.out.println("Quantidade de filmes: " + catalago.qtdFilmes());
            System.out.println("Filmes de ação: " + catalago.qtdFilmesAcao());
            System.out.println("Filmes de comédia: " + catalago.qtdFilmesComedia());
            System.out.println("Filmes de suspense: " + catalago.qtdFilmesSuspense());
            System.out.println("Filmes de animação: " + catalago.qtdFilmesAnimacao());

            System.out.println("Soma das bilheterias: " + catalago.somaBilheteria());
            System.out.println("Média de duração: " + catalago.mediaDuracao());

            System.out.println("Filme com maior bilheteria: " + catalago.maiorBilheteria());
            System.out.println("Filme com menor bilheteria: " + catalago.menorBilheteria());

            System.out.println("Filme com maior orçamento: " + catalago.maiorOrcamento());
            System.out.println("Filme com menor orçamento: " + catalago.menorOrcamento());

            System.out.println("Filme mais antigo: " + catalago.filmesMaisAntigo());
            System.out.println("Filme mais novo: " + catalago.filmeMaisNovo());

            System.out.println("Filmes com mais de 1 bilhão nas bilheterias:" + catalago.filmesMais1Bi());

            System.out.println("Filmes com menos de 500 milhões nas bilheterias: " + catalago.filmesMenos500Mi());

            System.out.println("Buscar filme:");
            String nome = dados.nextLine();

            Filme filmeEncontrado = catalago.pesquisarFilme(nome);
            if(filmeEncontrado != null){
               System.out.println("Filme encontrado: " + filmeEncontrado);
            }
            else{
               System.out.println("Nenhum filme encontrado com o título informado!");
            }


           
    }
    
}
