import java.util.Scanner;
public class ex3
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double num1,num2, soma;
        
        System.out.println("Informe um número: ");
        num1 = dados.nextDouble();
        System.out.println("Informe outro número: ");
        num2 = dados.nextDouble();
        
        System.out.println("A soma entre os números é: " + (num1 + num2));
        System.out.println("A diferença entre os números é: " + (num1 - num2));
        System.out.println("A muliplicação entre os números é: " + (num1 * num2));
        System.out.println("A divisão entre os números é: " + (num1 / num2));
  }
}


