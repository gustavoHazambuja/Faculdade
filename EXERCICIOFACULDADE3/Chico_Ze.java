import java.util.Scanner;
public class Chico_Ze
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int anos = 0;
        
        
        
        while ( alturaZe < alturaChico){
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;
            
        }
        System.out.println("O Zé vai ser maior que o Chico em: " + anos + " anos ");
    }
}
       
    
