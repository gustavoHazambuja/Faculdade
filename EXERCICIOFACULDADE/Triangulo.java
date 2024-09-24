import java.util.Scanner;
public class Triangulo
{
    public static void main(String args[]){
        double lad1,lad2,lad3;
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o primeiro lado: ");
        lad1 = dados.nextDouble();
        System.out.println("Informe o segundo lado: ");
        lad2 = dados.nextDouble();
        System.out.println("Informe o terceiro lado: ");
        lad3 = dados.nextDouble();
        if( lad1 == lad2 && lad2 == lad3){
            System.out.println("O triângulo é equilátero: ");
        }else if (lad1 == lad2 || lad1 == lad3 || lad2 == lad3){
            System.out.println("O triângulo é isósceles: ");
        }    
        else{
            System.out.println("O triângulo é escaleno: ");
        }
        
   }

}


      
                 
        
           
   
   
       
            
             
       
 
        
    
            
            
        
            
        
        
        
        
        
        
        
        
        
        
    
    
    

    
    
    
    

    
    
    
    
        
    
        
        
        
        
        
        
        
        
        
        
      
        
         
        
    
            
        
        
        
        
        
        
        
        
        
        
        
            
            
        
    
        
        
        
        
        
        
        
        
      
        
        
        
        
           
           
      
            
            
            
        
      
            
        
      
            
            
        
        
        

        
     
        
        
    

    
    
    
    
    
    

    
