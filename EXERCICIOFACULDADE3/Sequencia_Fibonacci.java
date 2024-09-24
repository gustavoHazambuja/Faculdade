import java.util.Scanner;
public class Sequencia_Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor = 10;
        int primeiroTermo = 1;
        int segundoTermo = 1;
        
        System.out.println("Os " + valor + " primeiros termos da sequência de Fibonacci são: ");
        System.out.println(primeiroTermo);
        System.out.println(segundoTermo);
        
        for(int i = 3; i <= valor; i++){
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
