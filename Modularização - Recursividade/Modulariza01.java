import java.util.Scanner;
public class Modulariza01
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double nro1, nro2, media;
        
        separador();
        System.out.println("Informe o número 1: ");
        nro1 = dados.nextInt();
        
        separador();
        System.out.println("Informe o número 2: ");
        nro2 = dados.nextInt();
        
        media = (nro1 + nro2) / 2;
        separador();
        System.out.println("A média calculada foi: " + media);
    }

    public static void separador(){
        System.out.println("**************");
    }

}
