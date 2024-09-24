import java.util.Scanner;
public class Anal_Valores
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double soma = 0;
        int div = 0;
        int nulo = 0;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Quantos valores quer digitar? ");
        double val = dados.nextInt();
        
        for(int i = 1; i <= val; i++){
            System.out.println("Informe o " + i + "o valor: ");
            double val2 = dados.nextInt();
            soma += val2;
            if(val2 %5 ==0){
                div ++;
            }
            if(val2 == 0){
                nulo++;
            }
            if(val2 %2 == 0){
                pares += val2;
            }else{
                impares += val2;
            }
            
        }
        System.out.println("A soma entre os valores foi: " + soma);
        System.out.println("A média entre os valores foi: " + soma/val);
        System.out.println("Os valores divisíveis por 5 foi: " + div);
        System.out.println("Valores nulos: " + nulo);
        System.out.println("A soma dos valores pares foi: " + pares);
        System.out.println("A soma dos valores impares foi: " + impares);
    }
}


