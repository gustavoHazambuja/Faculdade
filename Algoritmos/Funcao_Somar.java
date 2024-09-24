import java.util.Scanner;
public class Funcao_Somar
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int num1,num2;
        int soma;
        
        System.out.println("Informe o primero valor: ");
        num1 = dados.nextInt();
        System.out.println("Informe o segundo valor: ");
        num2 = dados.nextInt();
        
        soma = somaN(num1,num2);
        
        System.out.println("A soma entre " + num1 + " e " + num2 + " é: "  + soma);
    }
    public static int somaN(int num1,int num2){
        return num1 + num2;
    }
}
