
public abstract class Membro
{
    private String nome;
    
    public Membro(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract double getMensalidade();
    
    public String toString(){
        return "Nome: " + nome;
    }
    
}
