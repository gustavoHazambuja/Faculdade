import java.util.Scanner;
public class Calculadora
{
    public static void main(String args[]){
        
        Scanner dados = new Scanner(System.in);
        
        double numero1, numero2, opcao, resultado;
        
        System.out.println("Informe número1: ");
        numero1 = dados.nextDouble();
        System.out.println("Informe número2: ");
        numero2 = dados.nextDouble();
        
        System.out.println("1-adição, 2-subtração, 3-multiplicação, 4-divisão: ");
        opcao = dados.nextDouble();
        
        if(opcao == 1){
            System.out.println("Resultado: " + (numero1+numero2));
        }else if(opcao==2){
            System.out.println("Resultado: " + (numero1-numero2));
        }else if(opcao==3){
            System.out.println("Resultado: " + (numero1*numero2));
        }else if(opcao==4){
            System.out.println("Resultado: " + (numero1/numero2));
        }else if (numero2 !=0){
            resultado = (numero1/numero2);
        }    
        else{
            System.out.println("ERRO: DIVISÃO POR ZERO NÃO EXISTE");
        }
        
    }
}
    
    
    
    
