import java.util.Scanner;

public class Soma_Duas_Matriz

{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int matA[][] = new int[4][4];
        int matB[][]= new int[4][4];
        int matC[][] = new int[4][4];
        
        int soma = 0;
        
        System.out.println("Informações da matriz A: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.println("Informe o valor da posição [" + i + "," + j + "]: ");
                matA[i][j] = dados.nextInt();
                soma =+ matA[i][j];
            }
        }
    
        System.out.println("Informações da matriz B: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.println("Informe o valor da posição [" + i + "," + j + "]: ");
                matB[i][j] = dados.nextInt();
                soma =+ matB[i][j];
            }
        }
        //Matriz C//
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                matC[i][j] = (matA[i][j] + matB[i][j]);
            }
        }
        
        System.out.println("Matriz A: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(matA[i][j] + " ");
             
            }
            System.out.println();
        }
        
        System.out.println("Matriz B: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(matB[i][j] + " ");
                
            }
             System.out.println();
        }
        
        System.out.println("Matriz C: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
    }
    
    

   
}
