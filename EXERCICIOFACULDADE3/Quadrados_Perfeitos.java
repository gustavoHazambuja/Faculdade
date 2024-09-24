import java.util.Scanner;
public class Quadrados_Perfeitos
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor de n: ");
        int valor = sc.nextInt();
        
        
        for(int count = 0; count * count < valor; count++){
           int quadrado = count * count;
           System.out.println(quadrado);
            
        }
    
  }
}
    

        
 
   


