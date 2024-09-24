import java.util.Scanner;
public class Alunos
{
    public static void main (String args[]){
        Scanner dados = new Scanner(System.in);
       
        System.out.println("Informa o números de alunos de uma turma: ");
        int alunos = dados.nextInt();
        
        double media,nota;
        double somaNota = 0;
        
        for(int i = 1; i<=alunos; i++){
          System.out.println("Informe a nota do aluno " + i + " no exercício de avaliação 1 : ");
          nota = dados.nextDouble();
          somaNota += nota;
        }
        
        media = somaNota / alunos;
        System.out.println("A média do exercício de avaliação 1 dos alunos é: " + media);
        
    }
    
}
    

