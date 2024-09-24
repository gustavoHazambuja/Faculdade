import java.util.Scanner;
public class Par_Impar
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = dados.nextInt();
        
        if(num %2 == 0){
            System.out.println("O número " + num + " é par ");
        }else{
            System.out.println("O número " + num + " é ímpar ");
        }
      
      
    }
}


