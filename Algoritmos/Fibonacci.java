import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int valor = 15;
        int Pritermo = 0;
        int Segtermo = 1;
        
        System.out.println(Pritermo);
        System.out.println(Segtermo);
   
       
        for(int i = 3; i <= valor; i++){
           int Proxtermo = Pritermo + Segtermo;
           System.out.println(Proxtermo + " ");
           Pritermo = Segtermo;
           Segtermo = Proxtermo;
        }
      
   }
}


