
public class Passagem
{
    private String CPF;
    private String nome;
    private String assento;
    private double custoPassagem;
    
    public Passagem(String cpf, String nome,String assento, double custo){
        this.CPF = cpf;
        this.nome = nome;
        this.assento = assento;
        this.custoPassagem = custo;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getAssento(){
        return assento;
    }
    
    public double getCustoPassagem(){
        return custoPassagem;
    }
    
    public double custoBagagem(int qtd,int[] pesos){
        double custo = 0;
        for(int i = 0; i<qtd; i++){
           custo += 0.50 * pesos[i];
        }
        return custo;
    }
    
    public double defineAssento(String a){
        assento = a;
        return 5.00;
    }
    
    public String toString(){
        return "[Passagem]: " + "Nome: " + nome + 
        " /" + " CPF: " + CPF + 
        " /" + " Assento: " + assento + 
        " /" + " Custo da Passagem: " + custoPassagem;
       
    }
    
}
