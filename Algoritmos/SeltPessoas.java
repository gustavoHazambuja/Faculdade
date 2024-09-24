import java.util.Scanner;
public class SeltPessoas
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int idade,sexo,cabelo;
        int opcao;
        int somaM = 0;
        int somaF = 0;
        
        do{

        System.out.println("==============================");
        System.out.println("     SELETOR DE PESSOAS       ");
        System.out.println(" ============================= ");
        System.out.println("Qual seu sexo? (1) Masculino (2) Feminino");
        sexo = dados.nextInt();
        System.out.println("Qual sua idade");
        idade = dados.nextInt();
        System.out.println("Qual a cor do seu cabelo?");
        System.out.println("-------------------------");
        System.out.println("(1) Preto, (2) Castanho, (3) Loiro, (4) Ruivo ");
        cabelo = dados.nextInt();
        System.out.println("Quer continuar? (1)Sim (2) Não ");
        opcao = dados.nextInt();
        
        switch(sexo){
            case 1:
                if(idade > 18 && cabelo == 2){
                  somaM++;  
                }
                break;
            case 2:
                if(idade > 25 && idade < 30 && cabelo == 3){
                    somaF++;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;       
        }
        switch(cabelo){
            case 1:
                break;
            case 2:    
                break;
            case 3:    
                break;
            case 4:    
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        switch(opcao){
            case 1:
                break;
            case 2:
                break;
                default:
                System.out.println("Opção inválida!");
                break;
        }
                
        
    
    }while(opcao != 2);
    
    System.out.println("Total de homens com mais de 18 anos com cabelos castanhos: " + somaM);
    System.out.println("Total de mulheres ente 25 e 30 anos com cabelos loiros: " + somaF);
    
    
   } 
}

