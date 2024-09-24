import java.util.Scanner;



public class Diagonal_Principal_Secundaria
{
    public static void lerMatriz(int[][] mat){
        System.out.println("Matriz 6x6: ");
        for(int i= 0; i<6;i++){
            for(int j=0; j<6; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int somaPrincipal(int[][] mat){
        int soma = 0;
        
        for(int i = 0; i<6; i++){
            for(int j = 0; j<6; j++){
                if(i == j){
                    soma += mat[i][j];
                }
            }
        }
        return soma;
    }
    
    public static int somaSecundaria(int[][] mat){
        int soma = 0;
        
        for(int i = 0; i<6; i++){
            for(int j =0; j<6; j++){
                if(i+j ==5){ // i+j ==2 para matriz 3x3; i+j ==3 para matriz 4x4//
                    soma += mat[i][j];
                }
            }
        }
        return soma;
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int mat[][] = new int[6][6];
        
        System.out.println("Informações da matriz: ");
        for(int i =0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.println("Informe o valor da posição [" + i + ","+ j + "] ");
                mat[i][j] = dados.nextInt();
            }
        }
        
        lerMatriz(mat);
         int somaPrincipal = somaPrincipal(mat);
         int somaSecundaria = somaSecundaria(mat);
         
        System.out.println("A soma dos elementos da diagonal principal é: " + somaPrincipal);
        System.out.println("A soma dos elementos da diagonal secundária é: " + somaSecundaria);
        
    }
    

    
}
