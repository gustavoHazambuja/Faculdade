import java.util.Scanner;
public class Pares_Impares
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num, pares = 0, impares = 0;
        
        
        
        do{
            System.out.println("Digite um número inteiro: Digite (0) para parar");
            num = sc.nextInt();
            
            if(num != 0){
                if(num % 2 == 0){
                    pares++;
                }else{
                    impares++;
                    
                }
            }  
        }while( num != 0);
         System.out.println("Quantidade de números pares: " + pares);
         System.out.println("Quantidade de números ímpares: " + impares);
            
        
        }  
 

    }


        

    

  
