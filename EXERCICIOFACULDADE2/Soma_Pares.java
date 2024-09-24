import java.util.Scanner;
public class Soma_Pares
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número interio positivo: ");
        int num1 = sc.nextInt();
        int num2 = 1;
        int par = 0;
        
        
       
       while( num2 <= num1){
            if ( num2 %2 == 0){
                par += num2;
           
           
          
        }
        num2++;
       
           
     }
     System.out.println("A soma dos números pares de 1 até " + num1 +" é: " + par);
    
    }
        
}
    

  
