import java.util.Scanner;
public class Num_Perfeito
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int num;
        int Divisores;
        do{
            System.out.println("Informe um número inteiro positivo: (0) Para parar ");
            num = dados.nextInt();
            
            String verifica = Num_Perfeito(num);

               System.out.println("O número " + num + verifica);
               Num_Perfeito(num);
               System.out.println();
            
         }while(num > 0);
    }
    public static String Num_Perfeito(int num) {
        int somaDiv = 0;
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0) {
                somaDiv += i;
              
            }
        }
        if(somaDiv == num){
            return " é perfeito!";
        }else{
            return " não é perfeito!";
        }
    }
}   


