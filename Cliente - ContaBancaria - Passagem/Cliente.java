
public abstract class Cliente
{
    private String nome;
    
    public Cliente(String nome){
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract double getMensalidade();
    
    
    @Override
    public String toString(){
        return "Nome: " + nome;
    }
    

   
}
