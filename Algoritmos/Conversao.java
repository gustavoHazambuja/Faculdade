import java.util.Scanner;
public class Conversao
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o valor em real: ");
        double real = dados.nextDouble();
        
        System.out.println("O valor em dólar será dê: " + (real * 5.13)); 
        
        
        
    
      
    }
}


