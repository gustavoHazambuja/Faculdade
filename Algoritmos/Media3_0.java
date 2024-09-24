import java.util.Scanner;
public class Media3_0
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        double nota1 = dados.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double nota2 = dados.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("Sua média é dê: " + media);
        
        if(media >= 9){
            System.out.println("Aproveitamento A! ");
        }else if(media >= 8 && media < 9){
            System.out.println("Aproveitamento B!");
        }else if(media >= 7 && media < 8){
            System.out.println("Aproveitamento C!");
        }else if(media >= 6 && media < 7){
            System.out.println("Aproveitamento D!");
        }else if(media >= 5 && media < 6){
            System.out.println("Aproveitamento E!");
     }
     else{
         System.out.println("Aproveitamento F!");
     }
  }

}


