import java.util.Scanner;
public class Paises
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
    int paises;
    
    System.out.println("Digite o código do país: ");
    System.out.println("1970 - País: Brasil: ");
    System.out.println("5378 - País: Grécia: ");
    System.out.println("3683 - País: Japão: ");
    paises = dados.nextInt();
    
    switch(paises){
        case 1970:
            System.out.println("País: Brasil: ");
            System.out.println("Língua oficial: Português: ");
            System.out.println("População: 215,3 milhões: ");
            System.out.println("Localização: América do Sul:");
            System.out.println("Moeda: Real  ");
            break;
        case 5378:
           System.out.println("País: Grécia: ");
            System.out.println("Língua oficial: Grego: ");
            System.out.println("População: 10,43milhões: ");
            System.out.println("Localização: Europa:");
            System.out.println("Moeda: Euro:  ");
            break;
        case 3683:
            System.out.println("País: Japão: ");
            System.out.println("Língua oficial: Japonês: ");
            System.out.println("População: 125,1 milhões: ");
            System.out.println("Localização: Ásia:");
            System.out.println("Moeda: Ienes:  ");
            break;
        default:
            System.out.println("Código inválido!: ");
            break;
            
        }
        
     }    
                
 }
    

        
 
   
