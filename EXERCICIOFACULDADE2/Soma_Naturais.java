import java.util.Scanner;
public class Soma_Naturais
{
    public static void main (String args[]){ 
        Scanner sc = new Scanner(System.in);
        
        int num;
        int soma = 0;
        int contador = 1;
        
        
        System.out.println("Digite um número inteiro positivo: ");
        num = sc.nextInt();
        
        while(contador <= num){
            soma+=contador;
            contador++;
            
            
            
            
        }
        
        
         System.out.println("A soma dos números inteiros positivos até " + num + " é " + soma);
      

    }
   }
 
        
        
   
    

  
