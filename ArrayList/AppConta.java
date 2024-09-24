import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AppConta
{
    
    private Agencia_Banco listacontas;
    
    public AppConta(){
        this.listacontas = new Agencia_Banco();
    }
    
    public static  void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int numero;
        double saldo;
        double saque;
        double valor;
        double deposito;
        
        
        
        AppConta app = new AppConta();
        
        int opcao;
        
        do{
          System.out.println("*******************");
          System.out.println("Menu interativo: ");
          System.out.println("*******************");
         
          System.out.println("(1) Cadastrar conta ");
          System.out.println("(2) Buscar conta por número ");
          System.out.println("(3) Remover conta ");
          System.out.println("(4) Listar contas " );
          System.out.println("(5) Depositar valor " );
          System.out.println("(6) Sacar valor ");
          System.out.println("(7) Transferir valor ");
          System.out.println("(8) Sair " );
          opcao = dados.nextInt();
          dados.nextLine();
          
          switch(opcao){
              case 1:
                  System.out.println("Informe o número da conta: ");
                  numero = dados.nextInt();
                  System.out.println("Informe o saldo da conta: ");
                  saldo = dados.nextDouble();
                  Conta novaConta = new Conta(numero,saldo);
                  app.listacontas.CadastrarConta(novaConta);
                  break;
                  
              case 2:
                  System.out.println("Informe o número da conta a qual deseja buscar: ");
                  numero = dados.nextInt();
                  Conta contaEncontrada = app.listacontas.buscarContaPorNumero(numero);
                if(contaEncontrada != null){
                    System.out.println("Conta encontrada: " + contaEncontrada);
                }else{
                    System.out.println("Conta não encontrada!");
                }
                break;
                
              case 3:
                  System.out.println("Informe o número da  conta a qual deseja reomver: ");
                  numero = dados.nextInt();
                  app.listacontas.removerConta(numero);
                  break;
                  
              case 4:
                  System.out.println("Lista de contas: ");
                  app.listacontas.listarContas();
                  break;
                  
              case 5:
                 System.out.println("Informe o número da conta  qual vai fazer  o depósito: ");
                 numero = dados.nextInt();
                 System.out.println("Informe o valor do depósito: ");
                 deposito = dados.nextDouble();
                 contaEncontrada = app.listacontas.buscarContaPorNumero(numero);
                  if(contaEncontrada != null) {
                        contaEncontrada.depositarValor(deposito);
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                  
              case 6:
                  System.out.println("Informe o número da conta a qual vai fazer o saque: ");
                  numero = dados.nextInt();
                  System.out.println("Informe um valor para sacar: ");
                  saque = dados.nextDouble();
                  contaEncontrada = app.listacontas.buscarContaPorNumero(numero);
                    if(contaEncontrada != null) {
                        contaEncontrada.sacarValor(saque);
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                  
              case 7:
                  System.out.println("Informe o número da conta de origem: ");
                  int numeroOrigem = dados.nextInt();
                  System.out.println("Informe o número da conta de destino: ");
                  int numeroDestino = dados.nextInt();
                  System.out.println("Informe o valor de transferência: ");
                  valor = dados.nextDouble();
                  Conta contaOrigem = app.listacontas.buscarContaPorNumero(numeroOrigem);
                  Conta contaDestino = app.listacontas.buscarContaPorNumero(numeroDestino);
                  if(contaOrigem != null && contaDestino != null){
                     contaOrigem.transferirValor(valor, contaDestino);
                  }else{
                   System.out.println("Conta de origem ou destino não encontrada.");
                }
                  break;
                  
              case 8:
                  System.out.println("Saindo... ");
                  break;
                
              default:
                  System.out.println("Opção inválida! ");
                  break;
          }
         
        }while(opcao != 8);
    }
    
    
}
