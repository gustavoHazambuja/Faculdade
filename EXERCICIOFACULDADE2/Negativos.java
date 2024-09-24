import java.util.Scanner;
public class Negativos
{
    public static void main (String args[]){ 
        Scanner sc = new Scanner(System.in);
        
        int num;
        int result;
        int contador = 1;
        int negativo = 0;
        
        
        do{
            System.out.println("Digite um número: ");
        num = sc.nextInt();
        if( num < 0){
           negativo++;
        
         
        }else{
             contador++;
        }
       
        
        }while( contador < 5);
        
        System.out.println("Quantidade de números negativos: " + negativo);
    
    

    }
   }
 
        
        
   
    

  
