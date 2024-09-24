import java.util.Scanner;
public class ContaBancaria
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        double Saldo_Inicial, saque, Saldo_atual, credito;
        int opcao;
        System.out.println("Digite o saldo: ");
        Saldo_Inicial = dados.nextDouble();
    
        System.out.println("1 - Mostrar o saldo: ");
        System.out.println("2 - Sacar um valor: ");
        System.out.println("3 - Deporsitar um valor :");
        opcao = dados.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Saldo da conta: R$ " + Saldo_Inicial);
                break;
            case 2:
                System.out.println("Saque um valor: ");
                saque = dados.nextDouble();
                Saldo_atual = Saldo_Inicial - saque;
                System.out.println("Saldo atual: R$ " + Saldo_atual);
                break;
            case 3:
                System.out.println("Deposite um valor: ");
                credito = dados.nextDouble();
                Saldo_atual = Saldo_Inicial + credito;
                System.out.println("Saldo atual: R$ " + Saldo_atual);
                break;
            default:
                System.out.println("Opção inválida: ");
                break;
                
            }
        }    
                
 }
    

        
 
   
