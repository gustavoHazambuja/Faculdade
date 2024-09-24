import java.util.Scanner;
public class Negativos
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int i = 1;
        int negativo = 0;
        
        System.out.println("Quantos números quer digitar? ");
        int num = dados.nextInt();
        
        do{
            System.out.println("Informe o " + i + "o número: ");
            int n = dados.nextInt();
            i++;
            
            if(n < 0){
            negativo++;
        }

        }
        while(i <= num);
   
        System.out.println("A quatidade de números negativos informados foi: " + negativo);
    }
}
      
      
        
        
    

