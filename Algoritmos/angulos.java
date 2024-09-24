import java.util.Scanner;
public class angulos
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int angulo;
        
        System.out.println("Digite um ângulo: ");
        angulo = dados.nextInt();
        
        double anguloRad = Math.toRadians(angulo);//Convertendo para radianos//
        double seno = Math.sin(anguloRad);//Calculando o seno//
        double cosseno = Math.cos(anguloRad);//Calculando o cosseno//
        double tangente = Math.tan(anguloRad);//Calculando a tangente//
        
        System.out.println("O seno de " + angulo + " é igual a " + seno);
        System.out.println("O cosseno de " + angulo + " é igual a " + cosseno);
        System.out.println("A tangente  de " + angulo + " é igual a " + tangente);
  }
}


