import java.util.Scanner;
public class Conta_Bancaria
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double saldoInicial, saque, saldoAtual, credito;
        int opcao;
        
        System.out.println("Digite o saldo: ");
        saldoInicial = dados.nextDouble();
        
        System.out.println("1 - Mostrar o saldo: ");
        System.out.println("2 - Sacar um valor: ");
        System.out.println("3 - Depositar um valor: ");
        opcao = dados.nextInt();
        
        switch(opcao){
             case 1:
                System.out.println("Saldo da conta: R$ " + saldoInicial);
                break;
            case 2:
                System.out.println("Saque um valor: ");
                saque = dados.nextDouble();
                saldoAtual = saque(saldoInicial,saque);
                System.out.println("Saldo atual: R$: " + saldoAtual);
                break;
            case 3:
                System.out.println("Deposite um valor: ");
                credito = dados.nextDouble();
                saldoAtual = credito(saldoInicial,credito);
                System.out.println("Saldo atual: R$ " + saldoAtual);
                break;
            default:
                System.out.println("Opção inválida");
        }
         
    }
    public static double saque(double saldoInical,double saque){
        return saldoInical - saque;
    }
    public static double credito(double saldoInical,double credito){
        return saldoInical + credito;
    }
}