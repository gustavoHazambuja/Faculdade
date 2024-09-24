
public class Carro extends Veiculo
{
    private int qtdPortas;
    
    public Carro(int ano, int qtdPortas){
        super(ano);
        this.qtdPortas = qtdPortas;
        
    }
    
    @Override
    public String toString(){
        return "[Carro] " + super.toString() + " /" + " Quantidade de portas: " + qtdPortas;
    }
    

}
