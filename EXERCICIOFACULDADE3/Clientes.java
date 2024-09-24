import java.util.Scanner;
public class Clientes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int clientes = 5;
        String [] nome = new String[clientes];
        double [] valorCompra = new double[clientes];
        
        
        for(int i = 0; i < clientes; i++){
            System.out.println("Informe o nome do(a) cliente " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
            System.out.println("Informe o valor de compras do(a) cliente " + nome[i] + " no ano passado: ");
            valorCompra[i] = sc.nextDouble();
            sc.nextLine();
            
            if(valorCompra[i] < 500){
                System.out.println("Você ganhou um bônus de 10%: ");
                
                
            }else{
                System.out.println("Você ganhou um bônus de 20%: ");
            }
            
            
        }
        
      
    }
}
