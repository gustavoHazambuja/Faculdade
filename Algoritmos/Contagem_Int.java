import java.util.Scanner;
public class Contagem_Int
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Início: ");
        int inic = dados.nextInt();
        
        System.out.println("Fim: ");
        int fim = dados.nextInt();
        
        if(inic < fim){
            while(inic <= fim){
                System.out.println(inic);
                inic++;
            }
        }else{
            while(inic >= fim){
                System.out.println(inic);
                inic--;
        }
    }
  }
}



