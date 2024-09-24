import java.util.Scanner;
public class Fatorial
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quantos fatorias quer fazer: ");
        int numF = dados.nextInt();
        
        while(numF > 0){
            System.out.println("Informe um número inteiro não negativo: ");
            int num = dados.nextInt();
            int fat = Fatorial(num);
            System.out.println("O fatorial de " + num + " é: " + fat);
            numF--;
            
        }
    }
    public static int Fatorial(int num){
       int fat = 1;
       for(int i = 1; i<= num; i++){
          fat *= i; 
        }
       return fat;
    }
}
