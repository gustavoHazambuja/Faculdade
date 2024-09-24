import java.util.Scanner;
public class Somatorio
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite um número inteiro positivo: ");
            int num = sc.nextInt();
            
            if(num < 0){
                System.out.println("Número inválido! Digite um número inteiro positivo: ");
                continue;
            }
            long fatorial = 1;
            long somatorio = 0;
            for(int j = 1; j <= num; j++){
                fatorial *= j;
                somatorio += j;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
            System.out.println("O somatório de " + num + " é " + somatorio);
        }
    }
}
       
    
