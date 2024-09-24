
public class pessoaFisica extends Pessoa
{
    private String CPF;
    
    public pessoaFisica(String nomeCompleto ,int anoNascimento, String CPF){
        super(nomeCompleto,anoNascimento);
        this.CPF = CPF;
        
    }
    
    public String getNomeCompleto(){
        return super.getNome();
    }
    public int getAnoNascimento(){
        return super.getAno();
    }
    public int getId(){
        return super.getId();
    }
    public String getCPF(){
        return CPF;
    }
    
    @Override
    public String toString(){
        return "[Pessoa Física] " + super.toString() + ", CPF: " + CPF; 
    }
    
    
    

}
