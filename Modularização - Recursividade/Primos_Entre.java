import java.util.Scanner;
public class Primos_Entre
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);

        int valA, valB;
        
        System.out.println("Informe o valor inteiro e positivo de 'a': ");
        valA = dados.nextInt();
        System.out.println("Informe o valor inteiro e positivo de 'b': ");
        valB = dados.nextInt();
        
        int quantP = Primos_Entre(valA,valB);
        System.out.println("A quantidades de valores primos entre " + valA + " e " + valB + " é " + quantP);
        
       
    }
    public static int Primos_Entre(int valA, int valB) {
        int quantP = 0;
       for(int i = valA; i < valB; i++){
           boolean primo = true;
           for(int j = 2; j <= Math.sqrt(valB); j++){
               if(i % j == 0){
                 primo = false;
                 break;
            }
        }
        if(primo){
            quantP++;
        }
     
    }
      return quantP;
  }
}

