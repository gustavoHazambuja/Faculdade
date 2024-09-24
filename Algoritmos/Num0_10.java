import java.util.Scanner;
public class Num0_10
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        int soma = 0;
        int pares = 0;
        int impares = 0;
       
        for(int i = 1; i <=6; i++){
        System.out.println("Informe o " + i + "o valor: ");
        int val = dados.nextInt();
        
        if(val > 0 && val < 10){
          soma++; 
          
          if(val % 2 != 0){
            impares += val;
          }else{
              pares += val;
          }
        }
       }
        
        System.out.println("Os valores informados entre 0 e 10 foi: " + soma);
        System.out.println("A soma dos valores pares entre 0 e 10 foi: " + pares);
        System.out.println("A soma dos valores ímpares entre 0 e 10 foi: " + impares);
      
        
    }
}


