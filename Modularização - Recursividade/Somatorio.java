import java.util.Scanner;
public class Somatorio
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);

        int val;
        do{
            System.out.println("Informe um valor inteiro e positivo: (0) Para parar ");
            val = dados.nextInt();
            
            int somaS = Somatorio(val);
            
            System.out.println("O somatório de " + val + " é " + somaS);
            
        }while(val > 0);
    }
    public static int Somatorio(int val) {
        int soma = 0;
        for(int i = 1; i <= val; i++){
            soma += i;
        }
        
      return soma;
    }
}


