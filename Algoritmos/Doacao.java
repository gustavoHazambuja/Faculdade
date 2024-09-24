import java.util.Scanner;
public class Doacao
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int doacao;
        
        System.out.println("(1) Para doar R$10");
        System.out.println("(2) Para doar R$25");
        System.out.println("(3) Para doar R$50");
        System.out.println("(4) Para doar outros valores");
        System.out.println("(5) Para cancelar");
        doacao = dados.nextInt();
        
        
        switch(doacao){
            case 1:
                System.out.println("Você doou R$10");
                break;
            case 2:
                System.out.println("Você doou R$25");
                break;
            case 3:
                System.out.println("Você doou R$50");
                break;
            case 4:
                System.out.println("Informe quanto doar: ");
                double valor = dados.nextDouble();
                System.out.println("Você doou R$ " + valor);
                break;
            case 5:
                System.out.println("Doação cancelada");
                break;
                
                default:
                    System.out.println("Opção inválida");
                    break;
        }
       
      
    }
}


