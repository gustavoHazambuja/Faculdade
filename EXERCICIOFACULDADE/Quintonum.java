import java.util.Scanner;
public class Quintonum
{
    public static void main(String args[]){
        int cont = 0;
        
        
        // Estrutura de repetição: for inicialização; condição; contador
        for( int i=1000; i<100000; i++){
            
            if(i%11==5){
                cont++;
                
            }
            if(cont==5){
                System.out.println("O valor do quinto maior número que 1000, cuja divisão por 11 tem resto 5 é: " +i);
                   break;
                
            }
            
        
        }
        
    }    
        
}               
     
                           
       
                            
                       
                 
