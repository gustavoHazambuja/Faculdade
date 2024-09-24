import java.util.Scanner;
public class Divisores_Quant
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);

        int num;
        do{
            System.out.println("Informe um número inteiro positivo: (0) Para parar ");
            num = dados.nextInt();
               int quantDivisores = Divisores_Quant(num);

               System.out.println("A quantidade de divisores de " + num + " é: " + quantDivisores);

         }while(num > 0);
    }
    public static int Divisores_Quant(int num) {
        int somaDiv = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                
                somaDiv++;
            }
        }
        return somaDiv;
    }
}


