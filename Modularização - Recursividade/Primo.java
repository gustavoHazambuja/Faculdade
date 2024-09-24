import java.util.Scanner;
public class Primo
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int num;
        int i = 2;
        do{
            System.out.println("Informe um número inteiro positivo: (0) Para parar ");
            num = dados.nextInt();
           
            String verifica =Primo(num);
            System.out.println("O número " + num + verifica);
            
           

         }while(num > 0);
    }
    public static String Primo(int num) {
        boolean primo = true;

      for(int i = 2; i <= Math.sqrt(num); i++){//Verifica a raiz quadrada//
          if(num %i == 0){
              primo = false;
              break;
          }
      }
      if(primo){
          return " é primo!";
      }else{
          return " não é primo!";
      }
    }   
}

