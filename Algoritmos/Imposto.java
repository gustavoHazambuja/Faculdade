import java.util.Scanner;
public class Imposto
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o valor do produto em dólar: ");
        double prod = dados.nextDouble();
        
        double imposto = (prod * 60) / 100;
        
        System.out.println("O imposto será dê US$: " + imposto );
        
      
    }
}


