import java.util.Scanner;
public class Primo
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        int contador = 1;
        
        System.out.println("Digite um número: ");
        int num = dados.nextInt();
        
        while(contador <= num){
            System.out.println(contador);
            contador++;
        }
        
        
    }
    
}
    

