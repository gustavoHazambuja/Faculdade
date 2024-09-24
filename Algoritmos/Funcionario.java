import java.util.Scanner;
public class Funcionario
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o nome do funionário: ");
        String nome = dados.nextLine();
        
        System.out.println("Informe o salário do funcionário: ");
        double sal = dados.nextDouble();
        
        System.out.println("Informe a quantidade de dependentes: ");
        int dep = dados.nextInt();
        
        switch(dep){
            case 0:
                double Nsal = sal + (sal * 5 / 100);
                System.out.println("O novo salário  de " + nome +  " é dê R$ " + Nsal);
                break;
            case 1, 2, 3:
                 Nsal = sal + (sal * 10 / 100);
                System.out.println("O novo salário  de " + nome +  " é dê R$ " + Nsal);
                break;
            case 4, 5, 6:
                 Nsal = sal + (sal * 15 / 100);
                System.out.println("O novo salário  de " + nome +  " é dê R$ " + Nsal);
                break;
                
                default:
                    Nsal = sal + (sal * 18 / 100);
                    System.out.println("O novo salário  de " + nome +  " é dê R$ " + Nsal);
                    break;
        }
        
        
        
       
        
      
  }
}


