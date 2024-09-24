
public class Economy extends Passagem
{
    public Economy(String cpf, String nome,String assento, double custo){
        super(cpf,nome,assento,custo);
        
    }
    
    @Override
    public double custoBagagem(int qtd,int[] pesos){
        double custo = 0;
        for(int i = 0; i<qtd;i++){
            custo += (0.50 * pesos[i]);
        }
        custo += 10.00 * qtd;
        return custo;
    }
    
    @Override
    public String toString(){
        return "[Passagem Economy]: Nome: " + getNome() +
        " / CPF: " + getCPF() + 
        " / Assento: " + getAssento() + 
        " / Custo da Passagem: " + getCustoPassagem();
    }

}
 
