import java.util.Scanner;
public class Horas
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        int hora, minutos, segundos;
        System.out.println("Que horas são: ");
        hora = dados.nextInt();
        
        System.out.println("Que minutos são: ");
        minutos = dados.nextInt();
        
        System.out.println("Que segundos são: ");
        segundos = dados.nextInt();
        
        int totalsegundo = (hora*3600) + (minutos*60) + segundos;
        int dia = 24*3600;
        int faltasegundo = dia - totalsegundo;
        
        if( hora < 0 || hora > 24 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60){
        System.out.println("Algum dado foi digitado errado: ");
    }else{
        System.out.println("Já se passaram-se: " + totalsegundo + " segundos");
        System.out.println("Restam-se para completar um dia:  " + faltasegundo +  " segundos");
    
    }
 }
}
        
 