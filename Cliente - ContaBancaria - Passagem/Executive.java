
public class Executive extends Passagem
{
    
    public Executive(String cpf, String nome,String assento, double custo){
        super(cpf,nome,assento,custo);
    }
    
    
    @Override
    public double custoBagagem(int qtd,int[] pesos){
        double custo = 0;
        for(int i = 0; i<qtd; i++){
            // Isenta o custo das duas primeiras bagagens
            if(i >= 2){
                custo += 0.50 * pesos[i];
            }
        }
        return custo;
    }
    
    public double getMilhas(){
        double passagem = super.getCustoPassagem();
        double milhas = (passagem * 10) / 100;
       
        return milhas;
    }
    
    public double novoCustoPassagem(){
        double passagem = super.getCustoPassagem();
        double milhas = (passagem * 10) / 100;
        double novoCusto = passagem - milhas;
        
        return novoCusto;
    }
    
    @Override
    public String toString(){
         return "[Passagem Executive]: Nome: " + getNome() + 
         " / CPF: " + getCPF() + 
         " / Assento: " + getAssento() +
         " / Milhas: " + getMilhas() +
         " / Custo da Passagem: " + novoCustoPassagem();
    }
    
}
