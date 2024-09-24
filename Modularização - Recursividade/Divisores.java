import java.util.Scanner;
public class Divisores
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int num;
        int Divisores;
        do{
            System.out.println("Informe um número inteiro positivo: (0) Para parar ");
            num = dados.nextInt();

               System.out.println("Os divísores de " + num + " são: ");
               Divisores(num);
               System.out.println();
            
         }while(num > 0);
    }
    public static void Divisores(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        
    }   
}

