import java.util.Scanner;

public class App_Retângulo
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        Retângulo r1 = new Retângulo(10, 13);
        
        
        System.out.println("Informações do retângulo1: ");
        System.out.println("A base do retângulo é: " + r1.getBase());
        System.out.println("A altura do retângulo é: " + r1.getAltura());
       
        System.out.println("A área do retângulo é: " + r1.areaRetangulo());
        System.out.println("O perímetro do retângulo é: " + r1.perimetroRetangulo());
        System.out.println("A diagonal do retângulo é: " + r1.diagonalRetangulo());
        
        System.out.println("*************************");
        System.out.println("Informações do retângulo2: ");
        System.out.println("Informe a medida da base do retângulo2: ");
        double base2 = dados.nextDouble();
        System.out.println("Informe a medida da altura do retângulo2: ");
        double altura2 = dados.nextDouble();
         Retângulo r2 = new Retângulo(base2,altura2);
        System.out.println("A base do retângulo é: " + r2.getBase());
        System.out.println("A altura do retângulo é: " + r2.getAltura());
       
        System.out.println("A área do retângulo é: " + r2.areaRetangulo());
        System.out.println("O perímetro do retângulo é: " + r2.perimetroRetangulo());
        System.out.println("A diagonal do retângulo é: " + r2.diagonalRetangulo());
        
    }

   
}
