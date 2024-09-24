import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeVeiculos
{
    private ArrayList<Veiculo> veiculos;
    
    public GerenciadorDeVeiculos(){
        this.veiculos = new ArrayList();
    }
    
    public void cadastrarCarro(Carro car){
        veiculos.add(car);
        System.out.println("Carro adicionado com sucesso! ");
    }
    
    public void cadastrarMoto(Moto mot){
        veiculos.add(mot);
        System.out.println("Moto adicionado com sucesso! ");
    }
    
    public void cadastrarCaminhao(Caminhao cam){
        veiculos.add(cam);
        System.out.println("Caminhão adicionado com sucesso! ");
    }
    
    public void buscarInformacao(String stringDeBusca){
        System.out.println("Buscando por " + stringDeBusca);
        boolean achouAlgo = false;
        
        for(Veiculo v: veiculos){
            if(v.toString().contains(stringDeBusca)){
                achouAlgo = true;
                System.out.println(v);
            }
        }
        
        if(!achouAlgo){
            System.out.println("Nenhuma informação encontrada! ");
        }
    }
    
    public void mostrarVeiculos(){
        if(veiculos.isEmpty()){
            System.out.println("Nenhum veículo cadastrado! ");
        }
        else{
            for(Veiculo v: veiculos){
                System.out.println(v);
            }
        }
       
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        GerenciadorDeVeiculos gerenciador = new GerenciadorDeVeiculos();
        
        int opcao;
      
        do{
            System.out.println("******************");
            System.out.println("Menu interativo:");
            System.out.println("******************");
          
            System.out.println("(1) Cadastrar carro ");
            System.out.println("(2) Cadastrar moto ");
            System.out.println("(3) Cadastrar caminhão ");
            System.out.println("(4) Mostrar veículos cadastradas ");
            System.out.println("(5) Buscar informação ");
            System.out.println("(6) Sair ");
            opcao = dados.nextInt();
            dados.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o ano de fabricação: ");
                    int anoFabricacao = dados.nextInt();
                    System.out.println("Informe a quantidade de portas do carro: ");
                    int qtdPortas = dados.nextInt();
                    Carro car = new Carro(anoFabricacao, qtdPortas);
                    gerenciador.cadastrarCarro(car);
                    break;
                    
                case 2:
                    System.out.println("Informe o ano de fabricação: ");
                    anoFabricacao = dados.nextInt();
                    System.out.println("Informe a cilindrada do motor: ");
                    double cilindradaDoMotor = dados.nextDouble();
                    Moto mot = new Moto(anoFabricacao,cilindradaDoMotor);
                    gerenciador.cadastrarMoto(mot);
                    break;
                    
                case 3:
                    System.out.println("Informe o ano de fabricação: ");
                    anoFabricacao = dados.nextInt();
                    System.out.println("Informe a capacidade de carga em toneladas: ");
                    double capacidade = dados.nextDouble();
                    Caminhao cam = new Caminhao(anoFabricacao,capacidade);
                    gerenciador.cadastrarCaminhao(cam);
                    break;
                    
                case 4:
                    System.out.println("Lista de veículos: ");
                    gerenciador.mostrarVeiculos();
                    break;
                    
                case 5:
                    System.out.println("Infomre o quê deseja buscar: ");
                    String stringDeBusca = dados.nextLine();
                    gerenciador.buscarInformacao(stringDeBusca);
                    break;
                    
                case 6:
                    System.out.println("Saindo... ");
                    break;
                    
                default:
                    System.out.println("Opção inválida! ");
            }
          
        }while(opcao != 6);
    

    }   
}
