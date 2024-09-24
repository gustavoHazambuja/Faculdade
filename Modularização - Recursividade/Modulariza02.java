import java.util.Scanner;
public class Modulariza02
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double num1, num2, media;
        
        separador();
        System.out.println("Informe o número 1: ");
        num1 = dados.nextInt();
        
        separador();
        System.out.println("Informe o número 2: ");
        num2 = dados.nextInt();
        
        
        separador();
        System.out.println("A média calculada foi: " + media(num1, num2));
    }

    public static void separador(){
        System.out.println("**************");
    }
    public static double media(double num1,double num2){
        return (num1 + num2) / 2;
    }
}
