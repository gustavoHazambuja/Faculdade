import java.util.Scanner;
public class Compare
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
        
    int valor1;
    int valor2;

        System.out.println("Digite um valor: ");
        valor1 = dados.nextInt();
        System.out.println("Digite outro valor: ");
        valor2 = dados.nextInt();
        int result = Integer.compare(valor1,valor2);
      
    if(result < 0){
        System.out.println(valor1 + " é menor que " + valor2);
    }else if(result > 0){
        System.out.println(valor1 + " é maior que " + valor2);
    }else{
        System.out.println(valor1 + " é igual a " + valor2);
    }
    
    }
}

