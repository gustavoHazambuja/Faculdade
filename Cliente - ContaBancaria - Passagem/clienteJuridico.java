
public class clienteJuridico extends Cliente
{
    private double mensalidade;
    
    public clienteJuridico(String nome, double mensal){
        super(nome);
        this.mensalidade = mensal;
    }
    
    public double getMensalidade(){
        return mensalidade;
    }
    
    public void setMensalidade(double novaMensalidade){
        if(novaMensalidade > 0){
            this.mensalidade = novaMensalidade;
        }
    }
    
    @Override
    public String toString(){
        return "[Cliente Jurídico] " + super.toString() + " / " + "Mensalidade: " + mensalidade;
       
    }
   

}
