import java.util.Scanner;
public class Partida_Futebol
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("  Internacional x Grêmio    ");
        System.out.println("-----------------------");
        
        System.out.println("Quantos gols do Inter?");
        int golsInt = dados.nextInt();
        
        System.out.println("Quantos gols do Grêmio?");
        int golsGre = dados.nextInt();
        
        int dif = Math.abs(golsInt - golsGre); //Diferença absoluta//
        
        System.out.println("Diferença de " + dif + " gols ");
        
        if(dif == 0){
            System.out.println("Status: Empate");
        }else if(dif >= 1 && dif <4){
            System.out.println("Status: Partida normal");
        }
        else{
            System.out.println("Status: Goleada");
        }
    }
}


