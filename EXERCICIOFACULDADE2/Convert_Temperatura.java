import java.util.Scanner;
public class Convert_Temperatura
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int cel;
        double soma;
        
        
        do{
            System.out.println("Insira uma temperatura em Celsius:");
            cel = sc.nextInt();
            soma = (cel*1.8)+32;
            
            
        }while(soma == 0);
         System.out.println("A temperatura em Fahrenheit é: " + soma);
            
        }
        
    }

     

   

  
