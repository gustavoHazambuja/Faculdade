import java.util.Scanner;
public class ContarDO_TAB
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
      int i = 1;
      
      System.out.println("Informe o número da tabuada: ");
      int tab = dados.nextInt();
      
      
        
        
      do{
          int res = tab * i;
          System.out.println(tab + " x " + i + " = " + res );
          
          
          i++;
          
      }
      while(i <= 10);
        
       
      
    }
}


