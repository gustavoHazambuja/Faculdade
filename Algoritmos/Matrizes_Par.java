import java.util.Scanner;
public class Matrizes_Par
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[][] mat = new int[3][3];
        int par = 0;
        
        for(int i = 1; i<= 3; i++){
            for(int j = 1; j<= 3; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i - 1][j - 1] = dados.nextInt();
            }
        }
        System.out.println("Matriz 3x3:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if(mat[i - 1][j -1] %2 == 0){
                  System.out.print("{" + mat[i-1][j-1] + "}");
                  par++;
                }else{
                     System.out.print(mat[i-1][j-1] + " ");
                }
                
            }
            System.out.println();
        }
        System.out.println("Total de números pares na matriz: " + par);
    }
}


