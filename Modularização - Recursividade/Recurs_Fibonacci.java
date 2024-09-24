import java.util.Scanner;
public class Recurs_Fibonacci
{
  public static int funcao3(int n){
if(n < 2){ return n; }
else { return (funcao3(n-1) + funcao3(n-2)); }
}
}
  

