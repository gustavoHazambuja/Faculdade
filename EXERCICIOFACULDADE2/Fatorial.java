 import java.util.Scanner;
public class Fatorial
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivio: ");
        int num = sc.nextInt();
        
        if(num < 0){
            System.out.println("ERRO: O número deve ser positivo: ");
            return;
        }
        int fatorial = 1;
        int contador = 1;
        
        while(contador <= num){
            fatorial *= contador;
            contador++;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);
     
        
       }
}
        

    

  
