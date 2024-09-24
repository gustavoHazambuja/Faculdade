import java.util.Scanner;
public class Tipomedia2
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        double nota1,nota2,nota3;
        int tipo;
        System.out.println("Informe a primeira nota: ");
        nota1 = dados.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = dados.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = dados.nextDouble();
        
        System.out.println("Qual tipo de média será escolhido: 1 - Arimética 2 - Ponderada 3 - Harmônica");
        tipo = dados.nextInt();
        
        switch(tipo){
            case 1:
              System.out.println("A média é: " + (nota1+nota2+nota3)/3);
              break;
            case 2:
                System.out.println("A média é: " + (nota1*0.3) + (nota2*0.3) + (nota3*0.4) / (0.3+0.3+0.4));
                break;
            case 3:
                System.out.println("A média é: " + 3/((1/nota1) + (1/nota2) + (1/nota3)));
                break;
              
        }
           
        
            
    }
        
}
            
                  
