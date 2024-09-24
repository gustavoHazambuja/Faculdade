
public class Filme
{
    private String nome;
    private int anoLancamento;
    private String diretor;
    private String genero;
    private String atorPrincipal;
    
    public Filme(String nome,int anoLancamento, String diretor, String genero, String atorPrincipal){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.genero = genero;
        this.atorPrincipal = atorPrincipal;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getAnoLancamento(){
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
     public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getAtorPrincipal(){
        return atorPrincipal;
    }
    public void setAtorPrincipal(String atorPrincipal){
        this.atorPrincipal = atorPrincipal;
    }
    
    public String toString(){
        return "Nome: " + nome + "\n Ano de lançamento: " + anoLancamento + " \n Diretor: " + diretor + "\n Gênero: " + genero + "\n Ator/Atriz principal: " + atorPrincipal;
    }
    
    
    
   
}  
        
    
    


