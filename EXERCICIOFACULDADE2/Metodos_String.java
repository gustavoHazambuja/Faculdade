import java.util.Scanner;
public class Metodos_String
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String palavra1,palavra2,juntas,trecho;
        char letra;
        int tamanho;
        
        System.out.println("Digite uma palavra: ");
        palavra1 = sc.nextLine();
        
        System.out.println("Digite outra palavra: ");
        palavra2 = sc.nextLine();
        
        if(palavra1.isEmpty()==true || palavra2.isEmpty()==true){
            System.out.println("Umas ou duas palavras são vazia: ");
            
        }else{
            palavra1 = palavra1.toUpperCase();
            palavra2 = palavra2.toUpperCase();
            System.out.println("Concatenação das palavras: ");
            
            juntas = palavra1.concat(palavra2);
            System.out.println(juntas);
            
            letra = palavra1.charAt(0);
            if(letra=='A')
            System.out.println("Tem 'a' na primeira letra: ");
            
            else
            System.out.println("Não tem 'a' na primeira letra: ");
            
            tamanho = palavra1.length();
            System.out.println("O tamanho da palavra: " + palavra1 +  "é " + tamanho);
            
            if(palavra1.length()<0)
               System.out.println("A palavra tem menos de 10 caracteres: ");
               
            if(juntas.contains("ABA: "))
               System.out.println("Tem aba: ");
               
            else
               System.out.println("Não tem aba: ");
               
               juntas = palavra1.concat(palavra2);
               
            
            
            
            
            
        }
        
    
    }
    
}
  