import java.util.Scanner;
public class Cinquenta_Valores
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
       int valor = 0;
       int limite = 0;
       int mediageral = 0;
       int maior = Integer.MIN_VALUE;
       int menor = Integer.MAX_VALUE;
       int valor1 = 0;
       
       while(limite < 8 ){
           System.out.println("Digite um valor: ");
           valor = sc.nextInt();
           if(valor > 0){
               mediageral = mediageral + valor;
               if(valor > maior)maior = valor;
               if(valor < menor)menor = valor;
               limite++;
               
           }else{
               System.out.println("ERRO, digite novamente! : ");
           }
           
           
       }
       System.out.println("A média dos valores é: " + (double)mediageral/valor);
           System.out.println("O maior valor é o: " + maior);
           System.out.println("O menor valor é o: " + menor);
          
       
       
    
    }
        
}
    

  
