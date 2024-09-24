
import java.util.Date;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto
{
    private LocalDate validade;
    
    public ProdutoPerecivel(String n, double p, LocalDate data){
        super(n,p);
        validade = data;
    }
    
    public String getNome(){
        return super.getNome().toUpperCase();
    }
    
    public double getPreco(){
        return super.getPreco();
    }
    
    public LocalDate getValidade(){
        return validade;
    }
    
    

}
