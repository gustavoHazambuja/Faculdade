import java.util.Scanner;
public class Habitantes
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double salario;
        int filhos;
        double medSalario = 0;
        double medfilhos = 0;
        double maior = Integer.MIN_VALUE;
        int numHabitantes = 0;
        int salAte2000 = 0;
        
        do{
            System.out.println("Informe seu salário: (salário negativo encerrará o programa) ");
            salario = sc.nextDouble();
            if(salario >= 0){
                medSalario += salario;
                numHabitantes++;
                if(salario <= 2000){
                    salAte2000++;
                }
                if(salario > maior)maior = salario;
                
            System.out.println("Informe o número de seus filhos: ");
            filhos = sc.nextInt();
            if(filhos >= 0){
                medfilhos += filhos;
                
            }
         
            }
            
        }while(salario >= 0);
        
        
        if(numHabitantes > 0){
            double percentsalAte2000 = (double) salAte2000 / numHabitantes * 100;
            System.out.println("A média dos salário da população é de: " + medSalario/numHabitantes);
            System.out.println("A média de filhos da população é de: " + medfilhos/numHabitantes);
            System.out.println("O maior salário é de: " + maior);
            System.out.println("O percentual de pessoas com salário até 2000 é de " + percentsalAte2000 + "%");
        }else{
            System.out.println("Nenhum habitantee informado: ");
        }
    }
}
