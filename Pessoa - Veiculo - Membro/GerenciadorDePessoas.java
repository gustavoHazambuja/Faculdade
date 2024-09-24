import java.util.ArrayList; // Importa a classe ArrayList para armazenar uma lista de pessoas
import java.util.Scanner; // Importa a classe Scanner para receber dados do usuário

// Classe GerenciadorDePessoas que gerencia uma lista de pessoas físicas e jurídicas
public class GerenciadorDePessoas
{
    // Atributo para armazenar a lista de pessoas (físicas e jurídicas)
    private ArrayList<Pessoa> pessoas;
     
    // Construtor da classe, inicializando a lista de pessoas
    public GerenciadorDePessoas(){
        pessoas = new ArrayList();
    }
    
    // Método para adicionar uma pessoa física à lista
    public void adicionarPessoaFisica(pessoaFisica pf){
        pessoas.add(pf);
        System.out.println("Pessoa física adicionada com sucesso! ");
    }
    
    // Método para adicionar uma pessoa jurídica à lista
    public void adicionarPessoaJuridica(pessoaJuridica pj){
        pessoas.add(pj);
        System.out.println("Pessoa jurídica adicionada com sucesso! ");
    }
    
    public void adicionarPessoa(Pessoa p){
        pessoas.add(p);
    }
    
    // Método para buscar informações na lista de pessoas
    public void buscarInformacao(String stringDeBusca){
        System.out.println("Buscando por " + stringDeBusca);
        boolean achouPeloMenosUm = false;
        
        // Percorre a lista de pessoas e verifica se alguma contém o termo de busca
        for(Pessoa p: pessoas){
            if(p.toString().contains(stringDeBusca)){ // Verifica se stringDeBusca está presente na representação de p
                achouPeloMenosUm = true;
                System.out.println(p); // Imprime as informações da pessoa encontrada
            }
        }
        
        // Se nenhuma pessoa for encontrada, exibe uma mensagem
        if(!achouPeloMenosUm){
            System.out.println("Nenhum registro encontrado! ");
        }
    }
  
    // Método para mostrar todas as pessoas cadastradas na lista
    public void mostrarPessoas(){
        if(pessoas.isEmpty()){
            System.out.println("Nenhuma pessoa cadastrada! ");
        }
        else{
            // Percorre a lista e imprime cada pessoa cadastrada
            for(Pessoa p: pessoas){
                System.out.println(p);
            }
        }
    }
  
    // Método principal, responsável por interagir com o usuário e chamar os outros métodos
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();  // Cria um objeto da classe GerenciadorDePessoas
      
        int opcao;
      
        do{
            // Exibe o menu interativo
            System.out.println("******************");
            System.out.println("Menu interativo:");
            System.out.println("******************");
          
            System.out.println("(1) Cadastrar pessoa física ");
            System.out.println("(2) Cadastrar pessoa jurídica ");
            System.out.println("(3) Buscar informação ");
            System.out.println("(4) Mostrar pessoas cadastradas ");
            System.out.println("(5) Sair ");
            opcao = dados.nextInt();
            dados.nextLine();  // Limpa o buffer do teclado
          
            // Switch case para lidar com as diferentes opções do menu
            switch(opcao){
                case 1:
                    // Cadastro de pessoa física
                    System.out.println("Informe o nome completo do(a) pessoa física: ");
                    String nomeCompleto = dados.nextLine();
                    System.out.println("Informe o ano de nascimento: ");
                    int anoNascimento = dados.nextInt();
                    System.out.println("Informe o CPF: ");
                    dados.nextLine();
                    String CPF = dados.nextLine();
                    pessoaFisica pf = new pessoaFisica(nomeCompleto,anoNascimento,CPF);
                    gerenciador.adicionarPessoaFisica(pf);
                    break;
                  
                case 2:
                    // Cadastro de pessoa jurídica
                    System.out.println("Informe o nome completo do(a) pessoa jurídica: ");
                    nomeCompleto = dados.nextLine();
                    System.out.println("Informe o ano de fundação: ");
                    int anoFundacao = dados.nextInt();
                    System.out.println("Informe o CNPJ: ");
                    dados.nextLine();
                    String CNPJ = dados.nextLine();
                    pessoaJuridica pj = new pessoaJuridica(nomeCompleto,anoFundacao,CNPJ);
                    gerenciador.adicionarPessoaJuridica(pj);
                    break;
                  
                case 3:
                    // Buscar informações com base em um termo de busca
                    System.out.println("Informe o quê deseja buscar: ");
                    String stringDeBusca = dados.nextLine();
                    gerenciador.buscarInformacao(stringDeBusca); // Passa o termo de busca
                    break;
                  
                case 4:
                    // Mostrar todas as pessoas cadastradas
                    System.out.println("Lista de pessoas: ");
                    gerenciador.mostrarPessoas();
                    break;
                  
                case 5:
                    // Sair do sistema
                    System.out.println("Saindo... ");
                    break;
                  
                default:
                    // Opção inválida
                    System.out.println("Opção inválida! ");
                    break;
            }
          
        } while(opcao != 5);  // O menu continua sendo exibido até que o usuário escolha a opção de sair
    }
}
