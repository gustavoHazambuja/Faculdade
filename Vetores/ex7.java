import java.util.Scanner;

public class ex7
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int[] vet = new int[5];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int quantPares = 0;
        int quantImpares = 0;
        
        for(int i = 0; i<5; i++){
            System.out.println("Informe o valor do vetor " + (i+1) + ": ");
            vet[i] = dados.nextInt();
            
            soma += vet[i];
            if(vet[i] > maior){
                maior = vet[i];
            }
            
            if(vet[i] < menor){
                menor = vet[i];
            }
            
            if(vet[i] %2 ==0){
                quantPares++;
            }
            
            if(vet[i] %2 != 0){
                quantImpares++;
            }
        }
        
       
        
        
        
        
        System.out.println("A soma dos vetores é: " + soma);
        System.out.println("O maior vetor é: " + maior);
        System.out.println("O menor vetor é: " + menor);
        System.out.println("A quantidade de vetores pares é: " + quantPares); 
         System.out.println("A quantidade de vetores ímpares é: " + quantImpares); 
    }
}
