import java.util.Scanner;
public class Soma_Entre_Pares
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);

        int valA, valB;
        
        System.out.println("Informe o valor inteiro e positivo de 'a': ");
        valA = dados.nextInt();
        System.out.println("Informe o valor inteiro e positivo de 'b': ");
        valB = dados.nextInt();
        
        int somaP = Soma_Entre_Pares(valA,valB);
        System.out.println("A soma dos pares entre " + valA + " e " + valB + " é " + somaP);
        
       
    }
    public static int Soma_Entre_Pares(int valA, int valB) {
        int somapar = 0;
       for(int i = valA; i < valB; i++){
           if(i% 2 == 0){
               somapar += i;
           }
           
       }
       return somapar;
    }
}


