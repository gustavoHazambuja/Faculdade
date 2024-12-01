public class Livro implements Comparable<Livro>{

    private String titulo;
    private String autor;
    private String isbn; // Código do livro
    private int anoPublicacao;
    private boolean estaEmprestado;

    public Livro(String titulo, String autor, String isbn, int ano) throws Exception{
        if(titulo == null || titulo.isEmpty()){
            throw new Exception("O título não pode ser nulo ou vazio!");
        }

        if(autor == null || autor.isEmpty()){
            throw new Exception("O autor não pode ser nulo ou vazio!");
        }

        if(isbn == null || isbn.isEmpty()){
            throw new Exception("O ISBN não pode ser nulo ou vazio!");
        }

        if(ano < 0){
            throw new Exception("O ano não pode ser negativo!");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = ano;
        this.estaEmprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void tomarEmprestado(){
        estaEmprestado = true;
    }

    public void devolver(){
        estaEmprestado = false;
    }

    public boolean estaEmprestado(){
        return this.estaEmprestado;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Livro outro = (Livro) obj; // Convertedo obj para Livro (instaceOf)
        return isbn.equals(outro.getIsbn());
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString(){
        return String.format("\nTítulo: %s\n" + 
        "Autor: %s\n" +
        "ISBN: %s\n" +
        "Ano de publicação: %d\n" +
        "*******************************"
        ,titulo,autor,isbn,anoPublicacao);
        
    }

    @Override
    public int compareTo(Livro o){
        return anoPublicacao - o.anoPublicacao;
    }

}