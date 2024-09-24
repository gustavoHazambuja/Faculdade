import java.util.Scanner;
public class Tabuada
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int result;
        int contador = 1;
        
        System.out.println("Digite um número para ver a tabuada: ");
        num = sc.nextInt();
        do{
            
            result = num * contador;
            System.out.println( num + " X " + contador + " = " + result);
            contador++;
            
        }while(contador <= 10);
        
        
        
        
        
        
        
       
        
       
      
    
        }
        
}
        

    

  
