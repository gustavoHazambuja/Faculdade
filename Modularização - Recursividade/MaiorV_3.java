import java.util.Scanner;
public class MaiorV_3
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        
        
        double n1, n2, n3;
        double maiorNum;
        
        
        System.out.println("Digite os três valores: ");
        n1 = dados.nextDouble();
        n2 = dados.nextDouble();
        n3 = dados.nextDouble();
        
        maiorNum = maiorValor(n1, n2, n3);
        
        
       
        System.out.println("O maior valor é o número: " + maiorNum);
    }

    
    public static double maiorValor(double a, double b, double c){
        double maior = a;
        if(b > maior)
           maior = b;
        else if(c > maior)
           maior = c;
            return maior;
    }
}

