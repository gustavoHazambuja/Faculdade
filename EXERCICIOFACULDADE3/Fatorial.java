import java.util.Scanner;
public class Fatorial
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        int contador = 1;
        
        for( int i = 1; i <= 5; i++){
            System.out.println("Digite um número positivo: ");
            int num = dados.nextInt();
            
            if(num<0){
                System.out.println("Número inválido: Digite um número positivo: ");
                continue;
            }
            long fatorial = 1;
            for(int j = 1; j<=num;j++){
                fatorial *= j;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }
    }
}
    

