import java.util.Scanner;
public class Somar
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int i = 1;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        while(i <= 5){
        System.out.println("Digite o " + i +"o valor: ");
        int num = dados.nextInt();
        i++;
        
        soma += num;
        if(num > maior)maior = num;
        if(num < menor)menor = num;
        
        
        

        }
        System.out.println("A soma dos números foi: " + soma);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
       
    }
}