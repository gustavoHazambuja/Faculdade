
public class Empresa extends Membro
{
    private double taxaFixa;
    
    public Empresa(String nome, double taxa){
        super(nome);
        this.taxaFixa = taxa;
    }
    
    public double getTaxaFixa(){
        return taxaFixa;
    }
    
    public double getMensalidade(){
        double mensalidade = taxaFixa;
        
        return mensalidade;
    }
    
    @Override
    public String toString(){
        return "[Empresa]: " + super.toString() +
        " / " + "Mensalidade: " + taxaFixa;
    }
    
    
    
}
