import java.util.Scanner;

public class ex1
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        int diasSemana = 7;
        double[]temperatura = new double[diasSemana];
        
        double soma = 0;
        double media;
        
        temperatura[0] = 19.0;
        temperatura[1] = 23.0;
        temperatura[2] = 21.0;
        temperatura[3] = 25.0;
        temperatura[4] = 22.0;
        temperatura[5] = 20.0;
        temperatura[6] = 24.0;
        
       for(int i = 0; i < diasSemana; i++){
           soma += temperatura[i];
       }
        
       media = soma / diasSemana;
       
       System.out.println("A média das temperaturas na semana é: " + media);
        
    }
    
}
