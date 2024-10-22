import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceções {
    
   
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

    boolean dadosValidos = false;

    while (!dadosValidos) {
        System.out.println("Digite um número:");

        try {
            int num = in.nextInt();
            if(num<0){
                System.out.println("Número negativo, tente novamente");
            }
            else{
                System.out.printf("Você digitou: %d", num);
                dadosValidos = true;
            }
           
        } catch (InputMismatchException e) {
            System.out.println("Era esperado um número");
            in.next();
          
        }  
    }
    in.close();

   }
    
    
/* 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o raio do círculo:");
        double raio = in.nextDouble();
        if(raio < 0){
            System.out.println("Raio não pode ser negativo!");
        }else{
            System.out.printf("Raio: %.2f", raio);
        }

        
        
    }
        */
}
