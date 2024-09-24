import java.util.Scanner;
public class Corrigi_Provas
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        
        System.out.println("Quantas questões tem a prova: ");
        int gabs = dados.nextInt();
        
        System.out.println("Quantos alunos responderam a prova: ");
        int alunos = dados.nextInt();
        
        int [] gab = new int[gabs];
        String [] nome = new String[alunos];
        int[][] respostas = new int[alunos][gabs];
        
        System.out.println("Passo 1 - Cadastro de Gabarito: ");
        System.out.println("-------------------------------");
        
        for(int i = 1; i <= gabs; i++){
            System.out.println("Questão " + i + ": ");
            gab[i - 1] = dados.nextInt();
        }
        dados.nextLine();
        for(int i = 1; i <= alunos; i++){
        System.out.println("-------------------------------");
        System.out.println("ALUNO " + (i + 1));
        System.out.println("Nome: ");
        nome[i] = dados.nextLine();
        System.out.println("-------------------------------");
        
        for(int j = 1; j <= gabs; j++){
            System.out.println("Questão " + (j + i) + ": ");
            respostas[i][j] = dados.nextInt();
        }
        dados.nextLine();
        }
        double soma = 0;
        int[] notas = new int[alunos];
        
        System.out.println("NOTAS FINAIS: ");
        System.out.println("-------------------------------");
        
        for(int i = 1; i <= alunos; i++){
            int nota = 0;
            for(int j = 0; j <= gabs; j++){
                if(respostas[i][j] == gab[j]){
                    nota++;
                }
            }
            notas[i] = nota;
            soma += nota;
            System.out.println(nome[i] +": " + nota);
        }
        
        
        System.out.println("-------------------------------");
        System.out.println("Média da turma: " + soma/alunos);
        
        
       
    }
}


