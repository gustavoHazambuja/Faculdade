import java.util.Scanner;
public class Recurs_Somatorio
{
   public static int funcao(int numero){
     if(numero == 0){
         return 0;
        }else{
            return numero + funcao(numero-1);
        }
    }
}

