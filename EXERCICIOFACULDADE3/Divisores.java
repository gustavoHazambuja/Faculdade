import java.util.Scanner;
public class Divisores
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro positivio: ");
        int val = sc.nextInt();
        
        System.out.println("Os divisores de " + val + " são: ");
        for(int i = 1; i <= val; i++){
            if( val % i == 0){
                System.out.println(i + "");
            }
        }
    }
}

