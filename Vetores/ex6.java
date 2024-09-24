import java.util.Scanner;

public class ex6
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        
        
        System.out.println("Informe um valor inteiro e positivo para 'a': ");
        int a = dados.nextInt();
        System.out.println("Informe um valor valor inteiro e positivo para 'b': ");
        int b = dados.nextInt();
       
        
        int quantPares = 0;
        for(int i = a+1; i <b; i++){
            if(i%2 ==0){
                quantPares++;
            }
        }
        int[] pares = new int[quantPares];
        
        int index = 0;
        for(int i =a+1; i<b; i++){
            if(i%2 ==0){
                pares[index] = i;
                index++;
            }
        }
       
        System.out.println("Vetores pares entre " + a + " e " + b + ":");
        for (int par : pares) {
           System.out.print(par + " ");
          
        }
        
    }
}
