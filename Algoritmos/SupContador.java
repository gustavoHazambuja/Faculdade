import java.util.Scanner;
public class SupContador
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int opcao;
        
        do{
        System.out.println("================= ");
        System.out.println("|     MENU       |");
        System.out.println(" ================= ");
        System.out.println("| (1) De 1 à 10  |");
        System.out.println("| (2) De 10 à 1  |");
        System.out.println("| (3) Sair       |");
        opcao = dados.nextInt(); 
        
        switch(opcao){
            case 1:
                int i = 1;
                while(i <= 10){
                System.out.println(i);
                i++; 
                }
                break;
            case 2:
                int j = 10;
                while(j >= 1){
                System.out.println(j);
                j--; 
                }
                break;
            case 3:
                System.out.println("Contagem finalizada! ");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }while(opcao != 3);
  }
}



