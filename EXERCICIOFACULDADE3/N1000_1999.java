import java.util.Scanner;
public class N1000_1999
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Os números entre 1000 e 1999 que são divididos por 11 com resto igual a 5 é: ");
        
        int count = 0;
    
        for( int i = 1001; i < 1999; i++){
            if( i % 11 == 5){
                System.out.println(i);
                
            }
        }
        
     }
}
