import java.util.Scanner;
import java.util.Arrays;
public class ORD_Cresc
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[] valor = new int [3];
        for(int i = 1; i <= 3; i++){
            System.out.println("Informe o " + i + "o valor: ");
            valor[i - 1] = dados.nextInt();
        }
        ordenarValores(valor);
        
        System.out.println("Valores em ordem crescente: ");
        for(int i = 1; i<= 3; i++){
            System.out.println(valor[i-1]);
        }
       
    }
    public static void ordenarValores(int[]valor){
        Arrays.sort(valor);//Coloco em ordem crescente//
    }
}
