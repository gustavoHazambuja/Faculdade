import java.util.Scanner;
public class Calend_Abril2015
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        String[] diasSemana = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }; 

        for(int dia = 1; dia <= 30; dia++){
            int indiceDiaSemana = (dia + 2) %7;
            
            System.out.println("Dia " + dia + ": " + diasSemana[indiceDiaSemana]);
            
        }
    }
}
        
        
        /*
        int diaInicial = 5;
        int diasAbril = 30;
        
        System.out.println("Calendário mês abril - 2015 ");
        System.out.println("-----------------------");
        System.out.println("DOM SEG TER QUA QUI SEX SAB ");
        
        for(int n = 1; n < diaInicial; n++){
            System.out.println("      ");
        }
        
        for(int dia = 1; dia <= diasAbril; dia++){
           if(dia < 10){
               System.out.println("   ");
           }
           
           System.out.println(dia + "   ");
           
           if((dia + diaInicial - 1) %7 == 0){
               System.out.println();
           }
        }
        
        
        
     }
}

*/




        
        