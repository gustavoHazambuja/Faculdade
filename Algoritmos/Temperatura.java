import java.util.Scanner;
public class Temperatura
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Fahrenheit ");
        int fah = dados.nextInt();
        
        System.out.println("A temperatura em Celsius é: " + (fah - 32) / (1.8));
        
        /*
        System.out.println("Informe a temperatura em Celsius: ");
        int cel = dados.nextInt();
        
        System.out.println("A temperatura em Fahrenheit é: " + (cel * 1.8 + 32));
        
     */  
    }
}


