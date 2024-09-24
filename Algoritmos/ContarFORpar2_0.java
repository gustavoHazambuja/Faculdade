import java.util.Scanner;
public class ContarFORpar2_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe um valor para começar a regressiva? ");
        int val = dados.nextInt();
        
        if(val % 2 == 1){
            val -=1;
        }
      
        for(int i = 0; val >= i; val -=2){
            System.out.println(val);
        }
        
      
    }
}


