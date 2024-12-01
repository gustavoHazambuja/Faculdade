import java.util.List;

public class App {
    public static void main(String[] args) {
        CatalagoFilmes catalago = new CatalagoFilmes();

        Filme f1 = null;
        Filme f2 = null;
        Filme f3 = null;

        try{
          f1 = new Filme("Os Vingadores", "Joss Whedon", "Ação", "536123", 2012);
          f2 = new Filme("Titanic", "James Cameron", "Romance", "4637642", 1997);
          f3 = new Filme("Um sonho de liberdade", "Frank Darobont", "Ficção policial", "786896923", 1994);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        catalago.adicionarFilme(f1);
        catalago.adicionarFilme(f2);
        catalago.adicionarFilme(f3);

        // catalago.removerFilmePorCodigo("536123");


        String palavraDeBusca = "Um sonho de liberdade";
        List<Filme> filmes = catalago.procurarPorTitulo(palavraDeBusca);

        for(Filme f: filmes){
            System.out.println(f);
        }


        System.out.println("Filmes ordenados por ano: ");
        for(Filme f: catalago.listarFilmesOrdenadosPoAno()){
            System.out.println(f);
        }

        catalago.alugarFilme("4637642");
        catalago.devolverFilme("4637642");


    }
}
