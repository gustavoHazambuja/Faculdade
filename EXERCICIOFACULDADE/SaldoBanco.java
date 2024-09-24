import java.util.Scanner;
public class SaldoBanco
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        double saldMed, cred;
        System.out.println("Informe o saldo médio: ");
        saldMed = dados.nextDouble();
        if ((saldMed)>=201 && ((saldMed)<=401)){
            cred = saldMed * 0.2;
        }else if ((saldMed)>=401 && ((saldMed)<=600)){
            cred = saldMed * 0.3;
        }else if (saldMed >=601){
            cred = saldMed * 0.4;
        }else {
            cred = saldMed;
        }
        if ((saldMed)>=0 && ((saldMed)<=200)){
            cred = saldMed * 0.0;
        }
        
        System.out.println("SALDO DO CLIENTE: R$" + saldMed);
        System.out.println("VALOR DE CRETIDO ESPECIAL: R$" + cred);
    }
}   
