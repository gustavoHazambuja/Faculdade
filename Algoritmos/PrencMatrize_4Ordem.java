import java.util.Scanner;
public class PrencMatrize_4Ordem
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[][] mat = new int[4][4];
        int somaDP = 0;
        int Prod2L = 1;
        int maior3COL = Integer.MIN_VALUE;
        
        for(int i = 1; i<= 4; i++){
            for(int j = 1; j<= 4; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i - 1][j - 1] = dados.nextInt();
                if(mat[i-1]==mat[j-1]){//Soma da diagonal´principal//
                    somaDP += mat[i-1][j-1];

            }
        }
    }
        System.out.println("Matriz de 4o ordem:");
        for ( int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(mat[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        for(int j = 1; j<= 4; j++){//Produto valores segunda linha//
            Prod2L *= mat[1][j-1];
        }
        for(int i = 1; i <= 4; i++){//Maior valor terceira coluna//
           if(mat[i-1][2] > maior3COL)maior3COL = mat[i-1][2]; 
        }
        System.out.println("A soma da diagonal principal é: " + somaDP);
        System.out.println("O produto dos valores da segunda linha é: " + Prod2L);
        System.out.println("O maior valor da terceira coluna é: " + maior3COL);
    
  }
}

