import java.util.Scanner;
public class ex4
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int num1;
        int num2; 
        
        System.out.println("Digite um número inteiro: ");
        num1 = dados.nextInt();
        System.out.println("Digite outro número inteiro: ");
        num2 = dados.nextInt();
        
        if(num1 >= num2){
            System.out.println("O número " + num1 + " é maior que " + num2);
            
        }else{
            System.out.println("O número " + num1 + " é menor que " + num2);
        }
        
      
  }
}


