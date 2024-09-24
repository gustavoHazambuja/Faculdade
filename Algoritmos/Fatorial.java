import java.util.Scanner;
public class Fatorial
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int i = 1;
        System.out.println("Quantos fatorias quer fazer?");
        int numF = dados.nextInt();
        
        do{
        System.out.println("Digite um número inteiro: ");
        int num = dados.nextInt();
        i = 1;
        int fat = 1;
     
        do{
        fat *= i;
        i++;
        
        }while(i <= num);
        System.out.println("O fatorial de " + num + " é: " + fat);
        
        numF--;
        }while(numF >0);
    }
}

