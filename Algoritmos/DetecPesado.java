import java.util.Scanner;
public class DetecPesado
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double maior = Integer.MIN_VALUE;
        String pesado = "";
        
        System.out.println("----------------------------------------");
        System.out.println(" D E T E C T O R    DE      P E S A D O ");
        System.out.println("---------------------------------------");
        
        System.out.println("Quantas pessoas quer detectar? ");
        int pessoas = dados.nextInt();
        
        String[] nome = new String[pessoas];
        double[] peso = new double[pessoas];
        
        for(int i = 1; i <= pessoas; i++){
            dados.nextLine();
            System.out.println("Informe o " + i + "o nome: ");
            nome[i - 1]= dados.nextLine();
            System.out.println("Informe o peso de " + nome[i - 1] + ": ");
            peso[i - 1] = dados.nextDouble();
            if(peso[i - 1]> maior)maior = peso[i - 1];
            pesado = nome[i - 1];
            
            
        }
        
        System.out.println("A pessoa mais pesada foi " + pesado + " com " + maior + " KG ");
      
    }
}


