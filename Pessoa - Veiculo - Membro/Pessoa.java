
public abstract class Pessoa
{
    private static int idGeral = 100;
    
    private int id;
    private String nome;
    private int ano;
    
    public Pessoa(String nome, int ano){
        this.id = idGeral++;
        this.nome = nome;
        this.ano = ano;
    }
    
    public int getId(){
        return id;
    }
    public int getAno(){
        return ano;
    }
    public String getNome(){
        return nome;
    }
    
    // Sobreescrevendo
    @Override
    public String toString(){
        return " ID = " + id + " : " + nome + " ("+ ano + ")"; 
    }
    
    

    
}
