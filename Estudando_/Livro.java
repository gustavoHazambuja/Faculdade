
public class Livro
{
    private String nome;
    private int codigo;
    private String autor;
    private int anoPublicacao;
    
    public Livro(String nome, int codigo, String autor, int anoPublicacao){
        this.nome = nome;
        this.codigo = codigo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
     public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
     public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public String toString(){
        return "Nome: " + nome + "\n Código: " + codigo + "\n Autor: " + autor + "\n Ano de publicação: " + anoPublicacao;
    }
    
  
    
}
