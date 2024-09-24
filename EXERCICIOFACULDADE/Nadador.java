import java.util.Scanner;
public class Nadador
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a idade do nadador: ");
        int idade = dados.nextInt();
        
        if ((idade>=5) && (idade<=7)){
            System.out.println("Nadador faz parte da categoria infantil A: ");
        }else if((idade>=8) && (idade<=10)){
            System.out.println("Nadador faz parte da categoria infantil B: ");
        }else if ((idade>=11) && (idade<=13)){
            System.out.println("Nadador faz parte da categoria juvenil A: ");
        }else if ((idade>=14) && (idade<=17)){
            System.out.println("Nadador faz parte da categoria juvenil B: ");
        }   
        else{
            System.out.println("Nadador faz parte da categoria Adulto: ");
        }
    }
}
 



       
 
   