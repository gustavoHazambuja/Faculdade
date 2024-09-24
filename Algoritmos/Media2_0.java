import java.util.Scanner;
public class Media2_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = dados.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = dados.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("Sua média é dê: " + media);
        
        if(media >= 7){
            System.out.println("Você está aprovado! ");
        }else if(media >= 5 && media <7){
            System.out.println("Você está em recuperação!");
        }
        else{
             System.out.println("Você está reprovado!");
        }
      
    }
}


