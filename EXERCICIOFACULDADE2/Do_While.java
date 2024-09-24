import java.util.Scanner;
public class Do_While
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("Digite um número positivo: ");
            num = sc.nextInt();
        }while(num <=0);
        System.out.println("Foi digitado um número positivo: " + num);
        
       
      
    
        }
        
}
        

    

  
