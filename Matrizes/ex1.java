import java.util.Scanner;

public class ex1
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int mat [][] = new int [3][4];
        int cont = 1;
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                
                mat[i][j] = cont;
                cont++;
            }
        }
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
     
}
