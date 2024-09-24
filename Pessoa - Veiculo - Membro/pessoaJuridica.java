

public class pessoaJuridica extends Pessoa
{
    private String CNPJ;
    
    public pessoaJuridica(String nomeCompleto, int anoFundacao,String CNPJ){
        super(nomeCompleto,anoFundacao);
        this.CNPJ = CNPJ;
    }
    
    public String getNomeCompleto(){
        return super.getNome();
    }
    public int getAnoFundacao(){
        return super.getAno();
    }
     public int getId(){
        return super.getId();
    }
    public String getCNPJ(){
        return CNPJ;
    }
    
    @Override
    public String toString(){
        return "[Pessoa jurídica]" + super.toString() + ", CNPJ: " + CNPJ;
    }
    

    
}
