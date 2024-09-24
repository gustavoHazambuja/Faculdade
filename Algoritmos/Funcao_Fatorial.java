import java.util.Scanner;
public class Funcao_Fatorial {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quantos fatoriais quer fazer?");
        int numF = dados.nextInt();
        
        while(numF > 0) {
            System.out.println("Digite um número inteiro: ");
            int num = dados.nextInt();
            int fat = Fatorial(num);
            numF--;
            System.out.println("O fatorial de " + num + " é: " + fat);
        }
    }
    public static int Fatorial(int num){
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}
