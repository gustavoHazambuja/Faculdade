import java.util.Scanner;
public class Verificar_Vogal
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = dados.nextLine().toUpperCase();
        
       int numVogais = 0;
       
       for(char letra: palavra.toCharArray()){ //converte uma string em um Array de char//
           
      if (letra == 'A' || letra =='E' || letra == 'I' || letra == 'O' || letra == 'U'){
           numVogais++;
       }
    }
       
        
         if (numVogais > 0){
             System.out.println("A palavra contém " + numVogais + " vogal: ");
         }else{
             System.out.println("A palavra não tem vogal: ");
         }
         
        }
    }

        
        
        
        
        
            
            
            
        
        
    
    
    

  
