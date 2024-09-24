import java.util.Scanner;


public class Conta
{
    private int numero;
    private double saldo;
    
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
     public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }  
    
    public void depositarValor(double deposito){
       if(deposito > 0){
            saldo += deposito;
            System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
       }else{
            System.out.println("Valor de depósito inválido");
       }
    }
    
    public void sacarValor(double saque){
         if(saque > 0 && saldo >= saque){
            saldo -= saque;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        }else{
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
    }
    
    public void transferirValor(double valor,Conta contaDestino){
         if(valor > 0 && saldo >= valor){
            this.sacarValor(valor);
            contaDestino.depositarValor(valor);
            System.out.println("Transferência realizada com sucesso. Saldo atual: R$ " + saldo);
        }else{
            System.out.println("Saldo insuficiente ou valor de transferência inválido");
        } 
        
    }
    
    public String toString(){
        return "Número: " + getNumero() + "\n Saldo: R$ " + getSaldo();
    }

}
