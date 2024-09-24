import java.util.Scanner;
public class ContarFORpar
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quer contar até quanto? ");
        int val = dados.nextInt();
        

        
     
        for(int i = 0; i <=val; i +=2){
            System.out.println(i);
        }
        
      
        
       
      
    }
}


