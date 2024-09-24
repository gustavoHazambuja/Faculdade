import java.util.Scanner;
public class Var_CompostaPar {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[] val = new int[7];
        int par = 0;
        
        for(int i = 1; i <= 7; i++){
            System.out.println("Informe o " + i + "o valor: ");
            val[i - 1] = dados.nextInt();
            if(val[i - 1] %2 == 0){
                par++;
            }
        }
        for(int i = 1; i<= 7; i++){
            if(val[i - 1] %2 == 0){
                System.out.println("Valor par na posição " + (i - 1));
            }
        }
        System.out.println("A quantidade de valores pares infomormados foi: " + par);
       
    }
}
