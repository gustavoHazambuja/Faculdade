import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = dados.nextLine();
        verificar(palavra);
        
    }
    public static void verificar(String text){
        StringBuilder sb = new StringBuilder(text);//Constroi strings mutáveis//
        sb.reverse(); //Inverte a string//
        if(text.equalsIgnoreCase(sb.toString())){
            System.out.println("A palavra é um palíndrome");
        }else{
            System.out.println("A palavra não é um palíndrome");
        }
    }
        
}        
