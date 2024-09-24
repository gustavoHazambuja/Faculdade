import java.util.*;

public class Supermercado
{
    private Caixa[] caixas;
    
    private double totalFaturado;
    private double totalPerda;
    private int qtdClientesAtendidos;
    private int qtdClientesNaoAtendidos;
    private double valorMenorCompra;
    private double valorMaiorCompra;
    
    public Supermercado(int qtdCaixas){
        int qtdCaixasACriar = Math.max(qtdCaixas,1);
        caixas = new Caixa[qtdCaixasACriar];
        
        for(int i = 0; i < qtdCaixasACriar; i++){
            caixas[i] = new Caixa(5,111);
        }
        
    }
    
    public void adicionarCliente(Cliente cliente){
        
           
        
    }
    
    public int numTotalCaixas(){
        int qtd = 0;
        
        
        return qtd;
    }
    
    public int qtdClientesAtendidos(){
        int qtd = 0;
        
        
        
        return qtd;
    }
    
    public int qtdClientesNaoAtendidos(){
        int qtd = 0;
        
        
        
        return qtd;
    }
    
    public double getTotalFaturado(){
        
        
        
        
        return totalFaturado;
    }
    
    public double getTotalPerda(){
        
        
        
        
        
        return totalPerda;
    }
    

    
    public double getValorMenorCompra(){
        return valorMenorCompra;

        
    }

    
    public double getValorMaiorCompra(){
       return valorMaiorCompra;
        
    }
    
    
    
    
    
    public int numCaixasDisponivel(){
        int qtd = 0;
        
        
        return qtd;
    }
    
    public int numCaixasFuncionando(){
        int qtd = 0;
        
        
        
        
        return qtd;
    }
    
    public int numCaixasParado(){
        int qtd = 0;
        
        
        
        
        return qtd;
    }
    
    
    
    
    
    

}
