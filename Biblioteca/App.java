import java.util.List;


public class App {
    public static void main(String[] args) {

        Biblioteca bib = new Biblioteca();

        Livro l1 = null;
        Livro l2 = null;
        Livro l3 = null;
        Livro l4 = null;


        try{
        l1 = new Livro("Dom Casmurro", "Machado de Assis", "978-85-359-0277-0", 1899);
        l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "978-85-7302-877-3", 1943);
        l3 = new Livro("1984", "George Orwell", "978-0-452-28423-4", 1949);
        l4 = new Livro("A Metamorfose", "Franz Kafka", "978-85-360-0753-4", 1915);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
       bib.adicionarLivro(l1);
       bib.adicionarLivro(l2);
       bib.adicionarLivro(l3);
       bib.adicionarLivro(l4);

       bib.removerLivroPorIsbn("978-0-452-28423-4");
       bib.contem("978-0-452-28423-4");

       String palavraDeBusca = "Dom";
       List<Livro> livros = bib.procurarPorTitulo(palavraDeBusca);
       System.out.println("Buscando por " + palavraDeBusca);
       System.out.println("*********************");
       for(Livro l: livros){
        System.out.println(l);
       }
       System.out.println("*********************");

    //    String palavraDeBusca = "Machado";
    //    List<Livro> livros = bib.procurarPorAutor(palavraDeBusca);
    //    System.out.println("Buscando por " + palavraDeBusca);
    //    System.out.println("*********************");
    //    for(Livro l: livros){
    //     System.out.println(l);
    //    }
    //    System.out.println("*********************");


       System.out.println("Livros ordenados por ano: ");
       for(Livro l: bib.livrosOrdenadosPorAno()){
        System.out.println(l);
       }

       bib.emprestarLivro("978-85-359-0277-0");
        
    }
}
