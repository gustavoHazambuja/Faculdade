import java.util.Scanner;
public class Repeticao
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int repeticao;
        
        System.out.println("Digite uma palavra: ");
        String palavra = dados.nextLine();
        System.out.println("Quantidade de vezes que ela deve ser repetida: ");
        repeticao = dados.nextInt();
        
        repetirPalavra(palavra,repeticao);
        
    }
    public static void repetirPalavra(String palavra, int repeticao){
        StringBuilder resultado = new StringBuilder();
        for(int i = 1; i <= repeticao; i++){
            resultado.append(palavra).append("");
        }
        System.out.println(resultado.toString());
    }
    
}  
       
