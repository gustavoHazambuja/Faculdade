import java.util.Scanner;
public class Conversao2_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quantos valores quer converter: ");
        int val = dados.nextInt();
        
        int i = 1;
        while(i <= val){
            System.out.println("Informe o valor em real: ");
        double real = dados.nextDouble();
        
        System.out.println("O valor em dólar será dê: " + (real * 5.13)); 
        i++;
        
        }
    }
}


