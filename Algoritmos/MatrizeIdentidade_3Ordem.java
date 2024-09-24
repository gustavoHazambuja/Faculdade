import java.util.Scanner;
public class MatrizeIdentidade_3Ordem
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[][] matID = new int[3][3];
        
        for(int i = 1; i<= 3; i++){
            for(int j = 1; j<= 3; j++){
                if(matID[i-1]==matID[j-1]){
                    matID[i-1][j-1] = 1;
                }else{
                    matID[i-1][j-1] = 0;
                }
            }
        }
        System.out.println("Matriz identidade de 3o ordem:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(matID[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}


