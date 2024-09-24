import java.util.Scanner;
public class IMC
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe sua massa em KG: ");
        double massa = dados.nextDouble();
        
        System.out.println("Informe sua altura em metros: ");
        double altura = dados.nextDouble();
        
        double IMC = massa / Math.pow(altura,2);
        
        System.out.println("Seu IMC é de " + IMC);
        
        if(IMC <= 18.5){
           System.out.println("Você está abaixo do peso ");
        }else if(IMC >= 18.6 && IMC <= 24.9){
            System.out.println("Você está no peso ideal ");
        }else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Você está levemente acima do peso  ");
        }else if(IMC >= 30 & IMC <= 34.9){
            System.out.println("Você está com obesidade de grau I ");
        }else if(IMC >35 && IMC <= 39.9){
            System.out.println("Você está com obesidade de grau II (severa) ");
        }
        
        else{
            System.out.println("Você está com obesidade de grau III (mórbida) ");
        }
    }
}


