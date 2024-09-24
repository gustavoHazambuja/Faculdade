import java.util.Scanner;
public class SomaDosImpares
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int somaimpar = 0;
        int digito;
        
        System.out.println("Digite um valor inteiro positivio: ");
        int val = sc.nextInt();
        
        while(val != 0){
            digito = val % 10; //Para extrair o último dígito do valor//
            if(digito %2 != 0){
                somaimpar += digito;
            }
            val /=10; //Removemos o último dígito//
        }
            
        
        System.out.println("A soma dos dígitos impares desse valor é: " + somaimpar);
    }
}


