import java.util.Scanner;
//Faça um programa que mostre as notas p1 de uma turma. Apresente essas notas em um formato de vetor, considerando cinco alunos,
//Solicite ao usuario que digite a nota dos 5 alunos, apresente essas notas na tela, a quantidade de notas acima de 7 inclusive.
//media das notas.
public class ex4
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        String[] aluno = new String[5];
        double[] nota = new double[5];
        double soma = 0;
        int acima7 = 0;
        
        for(int i = 0; i<5; i++){
            System.out.println("Informe o nome do aluno(a) " + (i+1) + ": ");
            aluno[i] = dados.nextLine();
           
        }
        for(int i = 0; i<5; i++){
             System.out.println("Informe a nota de " + aluno[i] + ": ");
            nota[i] = dados.nextDouble();
            
            soma += nota[i];
        }
        
        System.out.println("**************************");
        System.out.println("Média das notas: ");
        double media = soma/5;
        System.out.println(media);
        
        System.out.println("**************************");
        System.out.println("Notas acima de 7: ");
         for(int i = 0; i<5; i++){
             if(nota[i] > 7){
                 System.out.println(nota[i] + " | ");
                  acima7++;
             }
         }
         
         System.out.println("Quantidade de notas acima de 7: " + acima7);
      
         
    }
}
