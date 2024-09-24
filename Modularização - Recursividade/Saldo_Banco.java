import java.util.Scanner;
public class Saldo_Banco
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double salMed,cred;
        
        System.out.println("Informe o saldo médio: ");
        salMed = dados.nextDouble();
        
        cred = cred(salMed); 
        
        
        System.out.println("Saldo do cliente: R$" + salMed);
        System.out.println("Valor de crédito especial:R$" + cred); 
        
    }
    public static double cred(double salMed){
        if(salMed >= 0 && salMed <= 500)
             return salMed * 0;
         else if(salMed > 500 && salMed<= 1500)
             return salMed * 0.1;
         else if(salMed > 1500 && salMed <= 2500)
              return salMed * 0.15;
         else if(salMed > 2500 && salMed <= 4000)
               return salMed * 0.2;
         else
             return salMed * 0.25;
    }
}
