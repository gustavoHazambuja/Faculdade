import java.util.Scanner;
public class Caracteristica
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Os números inteiros de 4 dígitos que possuem a mesma característica que o número 3025 são: ");
      
        for(int i = 1000; i <= 9999; i++){
          int dupla1 = i % 100; //Pega os dois últimos dígitos//
          int dupla2 = i / 100; //Pèga os dois primeiros dígitos//
          int soma = dupla1 + dupla2;
          
          if(Math.pow(soma,2) == i){
              System.out.println(i);
          }
        }
    }
}

