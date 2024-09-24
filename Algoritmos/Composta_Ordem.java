import java.util.Scanner;
public class Composta_Ordem {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
       int[] num = new int[4];
       int aux;

       
      
       for(int i = 1; i <= 4; i++){
           System.out.println("Informe um número: ");
           num[i] = dados.nextInt();
           
       }
       for(int i = 1; i <= 3; i++){
           for( int j = i+1; j <= 4; i++){
               if(num[i] > num[j]){
                  aux = num[i - 1];
                  num[i] = num[j];
                  num[j] = aux;
               }
               
               
           }
       }
        System.out.println("Número em ordem crescente: ");
       for(int i = 1; i <= 4; i++){
           System.out.println(num[i]);
       }
    }
}
