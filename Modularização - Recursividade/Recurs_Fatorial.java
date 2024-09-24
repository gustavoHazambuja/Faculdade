import java.util.Scanner;
public class Recurs_Fatorial
{
    public static int fatorial(int num){
        if(num == 0 || num == 1){//Fatorial de 0 ou 1//
            return 1;
        }
        return num * fatorial(num - 1);
    }
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo: ");
        int numero = dados.nextInt(); 
        int resultado = fatorial(numero);
      System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
