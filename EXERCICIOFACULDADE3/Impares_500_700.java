import java.util.Scanner;
public class Impares_500_700
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        int impares = 0;
        int soma =0;
        
        for(int i = 501; i <=699; i++){
            if(i %2 != 0){
            impares++;
            soma += i;
        } 
    }
        
        System.out.println("A soma dos números impares entre 500 e 700 é: " + soma);
  
  }
}
    

        
 
   


