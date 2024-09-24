import java.util.Scanner;
public class Quadrados_Perfeitos
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor de n: ");
        int valor = sc.nextInt();
        int count = 0;
        int quadrado = count * count;
        
        while(quadrado < valor){
            System.out.println(quadrado);
            count++;
            quadrado = count * count;
        }
       
        
        
    }
}
     

         
      
     

      
           
           
          
        
        
       
           
     
    
    
    
        

    

  
