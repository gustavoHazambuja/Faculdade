import java.util.Scanner;
public class Niver2_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o ano atual: ");
        int ano1 = dados.nextInt();
        
        System.out.println("Informe o ano que você nasceu: ");
        int ano2 = dados.nextInt();
        
        int idade = (ano1 - ano2);
        
        System.out.println("Você tem ou terá " + idade + " anos ");
        
        if(idade >= 18){
            System.out.println("Você já está na maioridade");
        }else{
            System.out.println("Você não está na maioridade");
        }
      
    }
}


