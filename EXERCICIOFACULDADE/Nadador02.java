import java.util.Scanner;
public class Nadador02
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a idade do nadador: ");
        int idade = dados.nextInt();
        System.out.println("Tipo da categoria: 1 - infanitl A = 5 à 7 anos: ");
        System.out.println("Tipo da categoria: 2 - infantil B = 8 à 10 anos: ");
        System.out.println("Tipo da categoria: 3 - juvenil A = 11 à 13 anos: ");
        System.out.println("Tipo da categoria: 4 - juvenil B = 14 à 17 anos: ");
        System.out.println("Tipo da categoria: 5 - adulto = +18 anos: ");
        int classificacao = dados.nextInt();
        
        switch(classificacao){
            case 1:
                System.out.println("Nadador faz parte da categoria infanitl A: ");
                break;
            case 2:
                System.out.println("Nadador faz parte da categoria infantil B: ");
                break;
            case 3:
                System.out.println("Nadador faz parte da categoria juvenil A: ");
                break;
            case 4:
                System.out.println("Nadador faz parte da categoria juvenil B: ");
                break;
             case 5:
                 System.out.println("Nadador faz parte da categoria adulto: ");
                 break;
                
        }
        
        
        
        
        
        
        
        
        
        
        /*
        if ((idade>=5) && (idade<=7)){
            System.out.println("Nadador02 faz parte da categoria infantil A: ");
        }else if((idade>=8) && (idade<=10)){
            System.out.println("Nadador02 faz parte da categoria infantil B: ");
        }else if ((idade>=11) && (idade<=13)){
            System.out.println("Nadador02 faz parte da categoria juvenil A: ");
        }else if ((idade>=14) && (idade<=17)){
            System.out.println("Nadador02 faz parte da categoria juvenil B: ");
        }   
        else{
            System.out.println("Nadador02 faz parte da categoria Adulto: ");
        }*/
    }
}

 



       
 
   
