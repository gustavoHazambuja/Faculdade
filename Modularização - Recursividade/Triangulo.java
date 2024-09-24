import java.util.Scanner;
public class Triangulo
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite a altura do triângulo(em linhas): ");
        int linhas = dados.nextInt();
        
        altura(linhas);
        
    }
    public static void altura(int linhas){
        String c = "*";
        for(int i = 1; i <= linhas; i++){
            System.out.println(c);
            c += "*";
        }
       
        
    }
      
}        
