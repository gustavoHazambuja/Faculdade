import java.util.Scanner;

public class Soma_Elementos
{
    public static int somarMatriz(int[][] mat){
        int soma = 0;
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                soma += mat[i][j];
            }
        }
        return soma;
    }
    
    public static void lerMatriz(int[][] mat){
        System.out.println("Matriz 5x5: ");
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int mat[][] = new int[5][5];
      
        System.out.println("Informações da matriz: ");
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.println("Informe o valor da posição [" + i + "," + j + "]: ");
                mat[i][j] = dados.nextInt();
            }
        }
        
        somarMatriz(mat);
        int soma = somarMatriz(mat);
        lerMatriz(mat);
        System.out.println("A soma dos elementos da matriz é: " + soma);
        
        
    }
    
    

    
}
