import java.util.Scanner;

public class ex3
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        int[] alt = new int[5];
        double soma = 0;
        int acimaMedia = 0;
        int menor = Integer.MAX_VALUE;
        int posicao = 0;
        
        for(int i = 0; i<5; i++){
            System.out.println("Informe o " + (i+1) + "o valor: ");
            alt[i] = dados.nextInt();
            if(alt[i] > 0 && alt[i] < 200){
                System.out.println("Está dentro do intervalo!");
            }else{
                 System.out.println("Não está dentro do intervalo!");
            }
            
            soma += alt[i];
            
            
        }
        
        System.out.println("Alturas pares: ");
         for(int i = 0; i<5; i++){
             if(alt[i]%2 ==0){
                 System.out.println(alt[i] + " | ");
             }
             
         }
         System.out.println("***********************");
         System.out.println("Alturas cujos índices são pares: ");
          for(int i = 0; i<5; i++){
              if(i%2 == 0){
                  System.out.println("Índice " + i + ": " + alt[i]);
              }
          }
         
        System.out.println("***********************");
         System.out.println("Alturas pares  cujos índices são impares: ");
          for(int i = 0; i<5; i++){
              if(alt[i]%2 == 0 && i%2 != 0){
                  System.out.println("Índice " + i + ": " + alt[i]);
              }
          }
          
         System.out.println("***********************");
         System.out.println("Alturas ímpares  cujos índices são pares: ");
         for(int i = 0; i<5; i++){
              if(alt[i]%2 != 0 && i%2 == 0){
                  System.out.println("Índice " + i + ": " + alt[i]);
              }
          }
       
        System.out.println("***********************");
        System.out.println("Alturas ao contrário: ");
         for(int i = 4; i>= 0; i--){
             System.out.println(alt[i] + " | ");
         }
         
          System.out.println("***********************");
          System.out.println("Média de altura: ");
          double media = soma / 5;
          System.out.println(media);
          
        System.out.println("***********************");
        System.out.println("Alturas acima da média: ");
         media = soma/5;
         for(int i = 0; i<5; i++){
             if(alt[i] > media){
                 acimaMedia++;
                 System.out.println(alt[i] + " | ");
             }
         }
          System.out.println("Quantidade de alturas acima da média: " + acimaMedia);
        
        System.out.println("***********************");
        System.out.println("Menor altura: ");
        for(int i = 0; i<5; i++){
            if(alt[i] < menor){
                menor = alt[i];
                posicao = i;
                
            }
        }
        System.out.println("A menor altura é " + menor + " na posição " + posicao);
           
         
         
    }
}
