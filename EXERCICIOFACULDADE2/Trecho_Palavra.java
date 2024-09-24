import java.util.Scanner;
public class Trecho_Palavra
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = dados.nextLine();
        
        System.out.println("Digite um trecho da palavra: ");
        String trecho = dados.nextLine();
        
        boolean Trecho = palavra.contains(trecho);
        
        if (Trecho){
            System.out.println("A palavra " + palavra + " contém o trecho " + trecho);
        }else{
             System.out.println("A palavra " + palavra + " não contém o trecho " + trecho);
        }
        
    
         
        }
    }

        
        
        
        
        
            
            
            
        
        
    
    
    

  
