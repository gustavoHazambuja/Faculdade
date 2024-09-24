import java.util.Scanner;
public class Posição_Vogal
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        String palavra,vogal;
        
        
        System.out.println("Digite uma palavra: ");
        palavra = dados.nextLine();
        
        System.out.println("Digite uma vogal (A,E,I,O,U): ");
        vogal = dados.nextLine();
        
        char vogais = vogal.charAt(0);
        
        System.out.println("Digite a posição da vogal (1 A " + palavra.length()+ "): ");
        int posicao = dados.nextInt();
        
        if (posicao < 1 || posicao > palavra.length()) {
            System.out.println("Posição inválida. Digite um número entre 1 e " + palavra.length() + ".");
        }
        
        char vogalPosicao = palavra.charAt(posicao - 1);
        
         if (vogalPosicao == vogais) {
            System.out.println("A palavra " + palavra + " contém a vogal " + vogal + " na posição " + posicao + ".");
        } else {
            System.out.println("A palavra " + palavra + " não contém a vogal " + vogal + " na posição " + posicao + ".");
        }
    }
        
        
        
       
        
        
        
        
        
            
            
            
        }
        
    
    
    

  
