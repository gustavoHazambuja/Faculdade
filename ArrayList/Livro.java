import java.util.List;

public class Livro
{
    private String codigo;
    private String titulo;
    private int anoPublicacao;
    private List<String> autores;
    
    public Livro(String codigo, String titulo, int anoPublicacao, List<String> autores){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autores = autores;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public List<String> getAutores(){
        return autores;
    }
    public void setAutores(List<String> autores){
        this.autores = autores;
    }
    
    public String toString(){
        return "Código: " + getCodigo() + "\n Título: " + getTitulo() + "\n Ano da publicação: " + getAnoPublicacao() + "\n Autores: " + getAutores();
    }
    
    
}
