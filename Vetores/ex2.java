import java.util.Scanner;

public class ex2
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        
        
        int vetSoma[] = new int[5];
        int vetProd[] = new int[5];
        
        int negativos = 0;
        int par = 0;
        int impar = 0;
        int somaProd = 0;
        int soma = 0;
        
        
        System.out.println("Informe os elementos do primeiro vetor: ");
        for(int i = 0; i<5; i++){
            System.out.println("Informe o valor: " + (i+1) );
            vet1[i] = dados.nextInt();
            if(vet1[i] < 0){
                negativos++;
            }
            if(vet1[i] %2 ==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("****************************");
         System.out.println("Informe os elementos do segundo vetor: ");
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o valor: " + (i+1));
            vet2[i] = dados.nextInt();
            if(vet2[i] < 0){
                negativos++;
            }
             if(vet2[i] %2 ==0){
                par++;
            }else{
                impar++;
            }
            
            vetSoma[i] =vet1[i] + vet2[i];
            vetProd[i] = vet1[i] * vet2[i];
            soma += vetSoma[i];
            somaProd += vetProd[i];
        }
        
        System.out.println("VetSoma: ");
        for(int i = 0; i<5; i++){
            System.out.println(vetSoma[i] + "|");
        }
        System.out.println("*****************");
        System.out.println("VetProd: ");
        for(int i = 0; i<5; i++){
            System.out.println(vetProd[i] + "|");
        }
        
        System.out.println("A soma dos valores dos vetores é: " + soma);
        System.out.println("A soma dos produtos dos vetores é: " + somaProd);
        System.out.println("A quantidade de vetores negativos digitados foram: " + negativos);
        System.out.println("A quantidade de vetores pares digitados foram: " + par);
        System.out.println("A quantidade de vetores impares digitados foram: " + impar);
     
    }
}
