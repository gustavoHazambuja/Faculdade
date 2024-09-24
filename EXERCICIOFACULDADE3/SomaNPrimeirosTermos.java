import java.util.Scanner;
public class SomaNPrimeirosTermos
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         double soma = 0;
        
        System.out.println("Digite um valor inteiro e positivo:");
        int val = sc.nextInt();
        
        for(int i = 1; i <= val; i++){
            soma += 1.0/i;
        }
        
        System.out.println("A soma dos n primeiros termos até " + val + " é " + soma);
        
    }
}
