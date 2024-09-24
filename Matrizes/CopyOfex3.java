import java.util.Scanner;

public class CopyOfex3
{
    
    public static void lerMatriz(int[][] mat){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe os elementos da matriz 3x3: ");
        
        for(int i = 0; i<3; i++){
            for(int j = 0; i<3; j++){
                //[%d][d%] formata a string para mostrar a posição atual da matriz
                System.out.printf("Elemento [%d][%d]: ", i,j);
                
            }
        }
    }
    
    public static int somaMatriz(int[][] mat){
        int soma = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; i<3; j++){
                soma += mat[i][j];
            }
        }
        return soma;
    }
    
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int mat[][] = new int[3][3];
      
        lerMatriz(mat);
        
        int soma = somaMatriz(mat);
        System.out.println("A soma dos elementos da matriz é: " + soma);
        
        
        
    }
    

}
