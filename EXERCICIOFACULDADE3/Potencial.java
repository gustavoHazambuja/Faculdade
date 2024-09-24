import java.util.Scanner;
public class Potencial
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de x");
        int val1 = sc.nextInt();
        
        System.out.println("Digite o valor de y: ");
        int val2 = sc.nextInt();
                     
        int resultado = 1;
        for(int i = 0; i < val2; i++){
            resultado *= val1;
        }
        
        System.out.println("A potência de " + val1 + " elevado na " + val2 + " é "  + resultado);
    }
}

