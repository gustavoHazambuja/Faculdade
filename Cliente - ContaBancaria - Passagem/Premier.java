

public class Premier extends Executive
{

    public Premier(String cpf, String nome,String assento, double custo){
        super(cpf,nome,assento,custo);
    }
    
    
    @Override
     public double custoBagagem(int qtd,int[] pesos){
        double custo = 0;
        for(int i = 0; i<qtd; i++){
           custo += 0.50 * pesos[i];
        }
        double custoDesconto = (custo * 50) / 100;
        return custoDesconto;
    }
    
    @Override
    public double defineAssento(String a){
        super.getAssento();
        return 0.00;
    }
    
    @Override
    public double getMilhas(){
        double passagem = super.getCustoPassagem();
        double milhas = (passagem * 20) / 100;
       
        return milhas;
    }
    
    @Override
     public double novoCustoPassagem(){
        double passagem = super.getCustoPassagem();
        double milhas = (passagem * 20) / 100;
        double novoCusto = passagem - milhas;
        
        return novoCusto;
    }
    
    @Override
    public String toString(){
        return "[Passagem Premier]: Nome: " + getNome() + 
        " / CPF: " + getCPF() + 
        " / Assento: " + getAssento() +
        " / Milhas: " + getMilhas() +
        " / Custo da Passagem: " + novoCustoPassagem();
    }
}

