import java.util.Scanner;
public class BlocoUnico
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double nro1, nro2, media;
        
        
        System.out.println("****************");
        System.out.println("Informe o número 1: ");
        nro1 = dados.nextInt();
        System.out.println("****************");
        System.out.println("Informe o número 2: ");
        nro2 = dados.nextInt();
        
        media = (nro1 + nro2) / 2;
        System.out.println("****************");
        System.out.println("A média calculada foi: " + media);
    }
}
