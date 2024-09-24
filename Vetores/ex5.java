import java.util.Scanner;

public class ex5
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
      
        int []vet = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o valor do vetor " + (i+1)+  ": ");
            vet[i] = dados.nextInt();
        }
        
        System.out.println("********************");
        System.out.println("Valores pares: ");
        for(int i = 0; i<5; i++){
            if(vet[i] %2 ==0){
                 System.out.println(vet[i] + " | ");
            }
        }
      
        System.out.println("********************");
        System.out.println("Valores ímpares: ");
        for(int i = 0; i<5; i++){
            if(vet[i] %2 !=0){
                 System.out.println(vet[i] + " | ");
            }
        }
        
        System.out.println("********************");
        System.out.println("Valores cujos índices são pares: ");
        for(int i = 0; i<5; i++){
            if(i %2 ==0){
                System.out.println("Índice " + i + ": " + vet[i]);
            }
        }
        
        
        System.out.println("********************");
        System.out.println("Valores cujos índices são ímpares: ");
        for(int i = 0; i<5; i++){
            if(i %2 !=0){
                System.out.println("Índice " + i + ": " + vet[i]);
            }
        }
        
        System.out.println("******************");
        System.out.println("Valores pares cujos índices são ímpares: ");
        for(int i =0; i<5; i++){
            if(vet[i] %2 ==0 && i%2 !=0){
                System.out.println("Índice " + i + ": " + vet[i]);
            }
        }
        
        System.out.println("******************");
        System.out.println("Valores ímpares cujos índices são pares: ");
        for(int i =0; i<5; i++){
            if(vet[i] %2 !=0 && i%2 ==0){
                System.out.println("Índice " + i + ": " + vet[i]);
            }
        }
        
        System.out.println("********************");
        System.out.println("Valores invertidos: ");
        for(int i = 4; i >= 0; i--){
            System.out.println(vet[i] + " | ");
        }
         
    }
}
