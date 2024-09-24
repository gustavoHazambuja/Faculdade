import java.util.Scanner;
public class Triangulo
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado do triângulo: ");
        int num1 = dados.nextInt();
        System.out.println("Digite o segundo lado triângulo: ");
        int num2 = dados.nextInt();
        System.out.println("Digite o terceioro  lado do triângulo: ");
        int num3 = dados.nextInt();
        
        if(num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2){
            System.out.println("É um triângulo! ");
        if(num1 == num2 && num2 == num3){
            System.out.println("O triângulo é equilátero. ");
        }else if(num1 == num2 || num2 == num3 || num3 == num1){
             System.out.println("O triângulo é isóceles. ");
        }else{
             System.out.println("O triângulo é escaleno. ");
        }
        
        }else{
             System.out.println("Não é um triângulo! ");
        }
    }
}


