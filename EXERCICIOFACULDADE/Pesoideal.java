import java.util.Scanner;
public class Pesoideal
{
    public static void main(String args[]){
        double altura,sexo,masculino,feminino,opcao;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a altura em metros: ");
        altura = dados.nextDouble();
        System.out.println("1-Masculino, 2-Feminino");
        sexo = dados.nextDouble();
        if (sexo == 1){
            System.out.println("Peso ideal homem: " + (72.7*altura-58) + "Kg");
        }else{
            System.out.println("Peso ideal mulher:" + (62.1*altura-44.7) + "Kg");
        }            
 
    }    
}    
