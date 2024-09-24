import java.util.Scanner;
public class Recurs_Potencia
{
   public static int funcao(int a, int b){
if(b == 1){ return a;}
else { return a * funcao(a, b-1);}
}
  
}
