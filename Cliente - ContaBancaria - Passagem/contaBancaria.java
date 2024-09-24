
public class contaBancaria
{
    private int numConta;
    private String nomeCorrentista;
    private double saldo;
    
    public contaBancaria(int num, String nome){
        this.numConta = num;
        this.nomeCorrentista = nome;
        this.saldo = 0;
    }
    
    public int getNumConta(){
        return numConta;
    }
    
    public String getNome(){
        return nomeCorrentista;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean retirar(double valor){
        if(valor > 0 && saldo > valor){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
  
}
