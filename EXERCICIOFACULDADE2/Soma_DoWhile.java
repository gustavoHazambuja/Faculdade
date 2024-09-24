import java.util.Scanner;
public class Soma_DoWhile
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num;
        int soma = 0;
        
        do{
            System.out.println("Digite um número inteiro: Digite (0) para parar");
            num = sc.nextInt();
            soma += num;
            
        }while(num > 0 );
         System.out.println("A soma total dos positivos é: " + soma);
            
        }
        
 }

        

    

  
