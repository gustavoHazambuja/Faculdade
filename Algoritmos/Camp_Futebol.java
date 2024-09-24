import java.util.Scanner;
public class Camp_Futebol
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Quantos times vão jogar? ");
        int times = dados.nextInt();
        
        String time[] = new String[times];
        
        System.out.println("---------------------");
        System.out.println("CAMPEONATO DE FUTEBOL");
        System.out.println("---------------------");
        
        dados.nextLine();
        for(int i = 1; i <= times; i++){
            System.out.println("Informe o " + i + "o time: ");
            time[i - 1] = dados.nextLine();
            
        }
        System.out.println("---------------------"); 
        System.out.println("  TABELA DE PARTIDAS ");
        System.out.println("---------------------");
        
        for(int i = 1; i <= times; i++){
            for(int j = 1; j <= times; j++){
                if(i != j){
                    System.out.println(time[i - 1] + " X " + time[j - 1]);
                }
            }
               
        }
    }
}


