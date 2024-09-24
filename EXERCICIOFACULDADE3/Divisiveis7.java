import java.util.Scanner;
public class Divisiveis7
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Os 50 valores acima de 100 que são divisíveis por 7 são: " );
      
       
        int count = 0;
        for( int i = 101; count < 50; i++){
            if( i% 7 == 0 && i > 100){
                System.out.println(i);
                count++;
            }
        }
     }
}
