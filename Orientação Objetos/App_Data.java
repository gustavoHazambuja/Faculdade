import java.util.Scanner;


public class App_Data
{
    public static void main(String[] args){
        
        
        Data data1 = new Data(12,3,2015);
        
        if(data1.verificaData()){
            System.out.println("A data é válida!");
        }else{
            System.out.println("A data não é válida!");
        }
        
        System.out.println("Data fornecida: " + data1.getDia() + " de " + data1.mesExtenso() + " de " + data1.getAno());
        
        if( data1.bissexto(2015)){
             System.out.println("O ano é bissexto! "); 
        }else{
            System.out.println("O ano não é bissexto! ");

        }
        
        System.out.println("Dia por extenso: " + data1.diaExtenso());
        System.out.println("Mês por extenso: " + data1.mesExtenso());
    }
        
}  










    /*
        System.out.println("Informe o dia: ");
        int dia = dados.nextInt();
        System.out.println("Infomrme o mês: ");
        String mes = dados.nextLine();
        System.out.println("Informe o ano: ");
        int ano = dados.nextInt();
        
        System.out.println("Hoje é dia " + dia + " de " + mes + " de " + ano);
        */
        
        

