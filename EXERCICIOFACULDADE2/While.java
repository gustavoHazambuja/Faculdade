import java.util.Scanner;
public class While
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        int num = sc.nextInt();
        int fatorial = 1;
        int contador = 1;
         while(contador <= num ){
             fatorial*= contador;
             contador++;
         }
         
         
         if ( num %2 == 0){
                 System.out.println("Número par: ");
             }else{
                 System.out.println("Número ímpar: ");
             }
         System.out.println("O fatorial de " + num + " é: " + fatorial);
    
        }
        
}
    

  
