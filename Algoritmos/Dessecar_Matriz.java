import java.util.Scanner;
public class Dessecar_Matriz
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int[][] mat = new int[4][4];
        int opcao;
        int i = 1;
        int j = 1;
      
        for(i = 1; i<= 4; i++){
            for( j = 1; j<= 4; j++){
                System.out.println("Digite o valor da posição [" + i + "," + j + "]: ");
                mat[i - 1][j - 1] = dados.nextInt();
            }
        }
    
        do{
            System.out.println("MENU DE OPCOES");
        System.out.println("====================");
        System.out.println("(1) Mostrar a Matriz");
        System.out.println("(2) Diagonal Principal");
        System.out.println("(3) Triângulo Superior");
        System.out.println("(4) Triângulo Inferior");
        System.out.println("(5) Sair");
        opcao = dados.nextInt();
        
        switch(opcao){
            case 1:
              System.out.println("Matriz de 4o ordem:");
            for ( i = 1; i <= 4; i++){
              for ( j = 1; j <= 4; j++){
                System.out.print(mat[i - 1][j - 1] + " ");
            }
            System.out.println();
            } 
            break;
            case 2:
                System.out.println("Diagonal Principal: ");
                for(i = 1; i<= 4; i++){
                    for(j = 1; j<= 4; j++){
                        if(i==j){
                    System.out.print(mat[i-1][j-1] + " ");
                    }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Triângulo superior: ");
                  for(i = 1; i<= 4; i++){
                      for(j = 1; j<= 4; j++){
                          if(i < j){
                              System.out.print(mat[i-1][j-1] + " ");
                              
                          }
                      }
                      System.out.println();
                  }
                break;
            case 4:
                 System.out.println("Triângulo inferior: ");
                 for(i = 1; i<= 4; i++){
                      for(j = 1; j<= 4; j++){
                          if(i > j){
                              System.out.print(mat[i-1][j-1] + " ");
                              
                          }
                      }
                      System.out.println();
                  }
                break;
            case 5:
                System.out.println("Programa encerrado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }while(opcao != 5);
  }
}


