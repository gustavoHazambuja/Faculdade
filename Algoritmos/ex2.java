import java.util.Scanner;
public class ex2
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int i = 1;
        String nome;
        
        do{
        System.out.println("Digite seu nome: ");
        nome = dados.nextLine();
        System.out.println("Olá " + nome + "!");
        i++;
    
        
    }while(i <= 3);
  }
}


