import java.util.Scanner;
public class Contar3_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Até onde quer contar?");
        int count = dados.nextInt();
        
        System.out.println("De quanto em quanto?");
        int salto = dados.nextInt();
        int i = 0;
        
      while(i <= count){
          System.out.println(i);
          i += salto;
          
      }
        
       
      
    }
}


