import java.util.Scanner;
public class Niver
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o ano atual: ");
        int ano1 = dados.nextInt();
        
        System.out.println("Informe o ano que você nasceu: ");
        int ano2 = dados.nextInt();
        
        System.out.println("Você tem ou terá " + (ano1-ano2) + " anos. ");
        
    
      
    }
}


