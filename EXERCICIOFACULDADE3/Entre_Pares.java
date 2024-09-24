import java.util.Scanner;
public class Entre_Pares
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        int val1;
        int val2;
        int somapar = 0;
        
        System.out.println("Digite o valor de 'a': ");
        val1 = sc.nextInt();
        
        System.out.println("Digite o valor de 'b': ");
        val2 = sc.nextInt();
        
        for( int i = val1; i < val2; i++){
           if( i %2 == 0){
               somapar += i;
           }
           
        }
       System.out.println("A soma dos pares entre 'a' e 'b' é: " + somapar);
     }
}
       
    
