import java.util.Scanner;
public class Matrizes
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[][] mat = new int[3][2];//Declarar matriz 3x2//
        
        for(int i = 1; i<= 3; i++){
            for(int j = 1; j<= 2; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i - 1][j - 1] = dados.nextInt();
            }
        }
        System.out.println("Matriz 3x2:");//Exibir a matriz 3x2//
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(mat[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        
    }
}


