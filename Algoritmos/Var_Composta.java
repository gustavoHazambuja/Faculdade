import java.util.Scanner;
public class Var_Composta {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[] num = new int[5];//Armazena 5 valores//
        num[0] = 10;
        num[1] = 20;
        num[2] = 5;
        num[3] = 7;
        num[4] = 2;
        
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
    }
}
