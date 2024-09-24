import java.util.Scanner;
public class Contar4_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quer começar a conta da onde?");
        int count = dados.nextInt();
        
        System.out.println("De quanto em quanto?");
        int salto = dados.nextInt();
        
        
        int i = 1;
        
      while(count >= i){
          System.out.println(count);
          count -= salto;
          
      }
        
       
      
    }
}


