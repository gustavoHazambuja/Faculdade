import java.util.Scanner;
public class Numero_invert
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        int num,tamanho;
        
        System.out.println("Digite um número inteiro: ");
        num = dados.nextInt();
        
        String numInt = "" + num;
        String numInvert = "";
        
        tamanho = numInt.length();
        for (int i = 0;i < tamanho;i++){
            numInvert = numInt.charAt(i) + numInvert;
            
        }
        System.out.println("Número invertido é: " + numInvert);
        
    
        }
    }

        
        
        
        
        
            
            
            
        
        
    
    
    

  
