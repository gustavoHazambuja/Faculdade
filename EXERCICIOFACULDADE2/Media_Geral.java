import java.util.Scanner;
public class Media_Geral
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        double num;
        double count = 0;
        double pares = 0; 
        double impares = 0;
        double mediapar = 0;
        double mediaimpar = 0;
        double mediageral = 0;
        
        
        do{
            System.out.println("Digite um número positivo: Digite (0) para parar");
            num = sc.nextDouble();
            mediageral = mediageral + num;
            
            if(num != 0){
                if(num % 2 == 0){
                    mediapar = mediapar+num;
                    pares++;
                }else{
                    mediaimpar = mediaimpar+num;
                    impares++;
                    
                }
                count++;
            }  
        }while( num != 0);
         System.out.println("Quantidade de números pares: " + pares);
         System.out.println("Quantidade de números ímpares: " + impares);
         System.out.println("Média do números pares: " + mediapar / pares);  
         System.out.println("Média dos números ímpares: " + mediaimpar / impares);
         System.out.println("Média geral dos números: " + mediageral / count);
        }  
 

    }


        

    

  
