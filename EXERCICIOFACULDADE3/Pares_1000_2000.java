import java.util.Scanner;
public class Pares_1000_2000
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Os números pares entre 1000 e 2000 são: ");
        for( int i = 1002; i <= 1998; i++){
            if(i %2 == 0){
                System.out.println(i);
            }
        }
    }
}
 