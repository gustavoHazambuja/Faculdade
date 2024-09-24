import java.util.Scanner;

public class CadastroClientes
{
    public static void main(String[] args){
        GerenciadorDeClientes gerenciador =  new GerenciadorDeClientes();
        Scanner dados = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("**************************");
            System.out.println("      MENU INTERATIVO      ");
            System.out.println("**************************");
            
            System.out.println("(1) Cadastrar cliente físico: ");
            System.out.println("(2) Cadastrar cliente jurídico: ");
            System.out.println("(3) Mostrar clientes: ");
            System.out.println("(4) Sair: ");
            opcao = dados.nextInt();
            dados.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o nome do cliente: ");
                    String nome = dados.nextLine();
                    System.out.println("Informe a idade do cliente: ");
                    int idade = dados.nextInt();
                    System.out.println("Informe salário do cliente: ");
                    double sal = dados.nextDouble();
                    dados.nextLine();
                    clienteFisico cf = new clienteFisico(nome,idade,sal);
                    gerenciador.adicionarClienteFisico(cf);
                    break;
                    
                case 2:
                    System.out.println("Informe o nome do cliente: ");
                    nome = dados.nextLine();
                    System.out.println("Informe a mensalidade do cliente: ");
                    double mensal = dados.nextDouble();
                    dados.nextLine();
                    clienteJuridico cj = new clienteJuridico(nome,mensal);
                    gerenciador.adicionarClienteJuridico(cj);
                    break;
                    
                case 3:
                    System.out.println("Lista de clientes: ");
                    gerenciador.mostrarClientes();
                    break;
                    
                case 4:
                    System.out.println("Saindo... ");
                    break;
                    
                default:
                    System.out.println("Opção inválida! ");
                    break;
            }
        }while(opcao != 4);
    }
}
