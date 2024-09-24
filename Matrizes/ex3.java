import java.util.Scanner;

public class ex3
{
    
    public static void lerMatriz(double[][] mat){
        Scanner dados = new Scanner(System.in);
    }
    
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        double mat[][] = new double[3][3];
        double soma = 0;
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i][j] = dados.nextDouble();
                soma += mat[i][j];
            }
        }
        System.out.println("Matriz 3x3: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
    

}
