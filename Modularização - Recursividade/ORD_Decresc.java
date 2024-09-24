import java.util.Scanner;
import java.util.Arrays;
public class ORD_Decresc
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[] valor = new int [3];
        for(int i = 1; i <= 3; i++){
            System.out.println("Informe o " + i + "o valor: ");
            valor[i - 1] = dados.nextInt();
        }
        ordenarValores(valor);
        
        System.out.println("Valores em ordem decrescente: ");
        for(int i = 1; i<= 3; i++){
            System.out.println(valor[i-1]);
        }
       
    }
    public static void ordenarValores(int[]valor){
        Arrays.sort(valor);
        for(int i = 0; i < valor.length/2; i++){
            int temp = valor[i];
            valor[i] = valor[valor.length - 1 - i];
            valor[valor.length - 1 - i] = temp;
        }
    }
}
