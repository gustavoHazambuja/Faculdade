import java.util.Scanner;
public class Funcao_Par_Impar
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = dados.nextInt();
        
        String verifica = parOuimpar(num);
        
        System.out.println("O número " + num + " é " + verifica);
    }
    public static String parOuimpar(int num){
        if(num %2 ==0){
            return "par!";
        }else{
            return "impar!";
        }
    }
}

