import java.util.Scanner;


public class AppForma
{
   public static void main(String[] args){
       Scanner dados = new Scanner(System.in);
    
       String nome,cor;
       double lado, area;
       
       Forma[] listaFormas = new Forma[3];
       
       for(int i=0; i <3; i++){
           System.out.println("Informe o nome da forma " + (i+1) + ": ");
           nome = dados.nextLine();
           
           System.out.println("Informe a cor do " + nome + ": ");
           cor = dados.nextLine();
           
           
           System.out.println("Informe o lado do " + nome + ": ");
           lado = dados.nextDouble();
           
           System.out.println("Informe a área do " + nome + ": ");
           area = dados.nextDouble();
           
           dados.nextLine();
           
           Forma forma1 = new Forma(nome,cor,lado,area);
           listaFormas[i] = forma1;
           
        }
       
       System.out.println("Lista de formas: ");
       for(int i = 0; i<3; i++){
           System.out.println(listaFormas[i].toString());
       }
       
       
   }
       
   }


