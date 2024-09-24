import java.util.Scanner;
public class Composta_SoComC {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        String soC[] = new String[10];
        String nome;
        int tot = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Informe seu nome: ");
            nome = dados.nextLine();
            if(nome.charAt(0) == 'C'){
              soC[tot] = nome;
              tot++;
            }
        }
        System.out.println("LISTAGEM FINAL");
        for(int i = 0; i <= tot; i++){
            System.out.println(soC[i]);
        }
    }
}
