import java.util.Scanner;
public class While03
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int soma = 0;
        int num;
        int maior = 0;
       
        
        while( contador <= 5){
            System.out.println("Digite o " + contador + "o. valor: ");
            num = sc.nextInt();
            if( num > maior){
                maior = num;
            }else{
                soma += num;
            contador++;
            }
            
            
           
        }
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O maior número digitado foi: " + maior);
       
       }
       
    
    }
        

    

  
