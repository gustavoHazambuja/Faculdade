
public class Produto
{
    private String nome;
    private double preco;
    
    public Produto(String n, double p){
        this.nome = n;
        this.preco = p;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double novoPreco){
        preco = novoPreco;
    }
    
}
