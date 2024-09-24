import java.util.Scanner;
public class _50_Valores
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        int media = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int quantintervalo = 0;
        
        for( int i = 1; i <= 5; i++){
            System.out.println("Digite o valor " + i + ": ");
            int valor = sc.nextInt();
            
            if(valor > maior){
                maior = valor;
            }
         
            if(valor >=0 && valor <=10){
                quantintervalo++;
                media += valor;
                if(valor < menor) menor = valor;
                
            } else{
                System.out.println("Valor fora do intervalo: ");
                i--;
            }
        }
        System.out.println("A média dos valores é: " + (double)media/50);
        System.out.println("O maior valor é o: " + maior);
        System.out.println("O menor valor é o: " + menor);
        System.out.println("A quantidade de valores no intervalo [0, 10] é: " + quantintervalo);
     }
}
