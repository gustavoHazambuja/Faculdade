import java.util.Scanner;
public class Conversor_Moedas
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double real, dolar;
        int contador = 1;
        System.out.println("Quantas vezes quer converter: ");
        int convert = sc.nextInt();
        while( contador <= convert){
        
        
            System.out.println("Qual o valor em R$? ");
            real = sc.nextDouble();
        
            dolar = real/5.2;
        
            System.out.println("O valor em US$ é " + dolar);
            contador++;
    
        
        
    
        
       
      
    
        }
        
    }
}
        

    

  
