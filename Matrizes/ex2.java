import java.util.Scanner;


public class ex2
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        double[][] mat = new double[4][4];
        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                
                mat[i][j] = i * j;
            }
        }
        
        System.out.println("Matriz 4x4: ");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.println("Valor do produto da posição [" + i + ", " + j + "] " + mat[i][j]);
                //System.out.print(mat[i][j] + "  ");
            }
           
        }
        
        
    }
    

   
}
