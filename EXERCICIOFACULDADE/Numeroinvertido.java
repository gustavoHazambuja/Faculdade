import java.util.Scanner;
public class Numeroinvertido
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        int num, num_inv,n1,n2,n3,n4;
        System.out.println("Informe um número inteiro de 4 dígitos: ");
        num = dados.nextInt();
        
        n1 = num/1000; // Primeiro dígito (milhares) Resultado do prímeiro dígito
        n2 = num % 1000/100;  // Segundo dígito (centenas) Resultado do segundo dígito
        n3 = num % 100/10;  // Terceiro dígito (dezenas) Resultado do terceiro dígito
        n4 = num % 10;  // Quarto dígito (unidades) 
       
        
        System.out.println("Número invertido é: " + n4 + n3 + n2 + n1);
        
    }
        
 }
        
