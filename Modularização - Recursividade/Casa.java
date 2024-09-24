import java.util.Scanner;
public class Casa
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double larguCasa,CompriCasa;
        double larguTerreno, CompriTerreno;
        double AreaCasa, AreaTerreno, AreaLivre;
        
        System.out.println("Digite a largura da casa: ");
        larguCasa = dados.nextDouble();
        System.out.println("Digite o comprimento da casa: ");
        CompriCasa = dados.nextDouble();
        
        System.out.println("Digite a largura do terreno: ");
        larguTerreno = dados.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        CompriTerreno = dados.nextDouble();
        
        AreaCasa = AreaCasa(larguCasa,CompriCasa);
        AreaTerreno = AreaTerreno(larguTerreno,CompriTerreno);
        AreaLivre = AreaLivre(AreaCasa,AreaTerreno);
        
        
        
        System.out.println("A área da casa é: " + AreaCasa);
        System.out.println("A área do terreno é: " + AreaTerreno);
        System.out.println("A área livre é: " + AreaLivre);
    }

    public static double AreaCasa(double larguCasa, double CompriCasa){
        return larguCasa * CompriCasa;
    }
    public static double AreaTerreno(double larguTerreno, double CompriTerreno){
        return larguTerreno * CompriTerreno;
    }
    public static double AreaLivre(double AreaCasa, double AreaTerreno){
        return AreaTerreno - AreaCasa;
    }
}
