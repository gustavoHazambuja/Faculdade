import java.util.Scanner;
public class Funcao_Anal_Nomes {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Total de letras do seu nome: " + nome.length());
        System.out.println("Seu nome em letras maiúsculas: " + nome.toUpperCase());
        System.out.println("Seu nome em letras minúsculas: " + nome.toLowerCase());
        System.out.println("A primeira letra do seu nome é: " + nome.charAt(0));
        System.out.println("A última letra do seu nome é: " + nome.charAt(nome.length() - 1));
        
        // Procurar a letra 'A' no nome e imprimir sua posição
        int posicaoA = nome.toUpperCase().indexOf('A');
        if(posicaoA != -1){
            System.out.println("Seu nome tem a letra A na posição: " + (posicaoA + 1));
        }else{
            System.out.println("Seu nome não contém a letra A.");
        }
        // Imprimir o código Unicode da letra 'A'
        int codigoA = (int) 'A';
        System.out.println("O código da letra A é: " + codigoA);
        // Encontrar e imprimir a letra que corresponde ao código 65
        char letraCodigo65 = (char) 65;
        System.out.println("A letra de código 65 é: " + letraCodigo65);
        
        String nomeInvertido = new StringBuilder(nome).reverse().toString();
        System.out.println("Seu nome invertido é: " + nomeInvertido);
        
    }
}
