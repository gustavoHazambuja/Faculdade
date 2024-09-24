import java.util.Scanner;
public class Alunos
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        double Mnota = Integer.MIN_VALUE;
        double soma = 0;
        
        
        System.out.println("Quantos alunos tem a turma: ");
        int alunos = dados.nextInt();
        
        String[] nome = new String[alunos];
        double[] nota = new double[alunos];
        
        
        int i = 1;
        while(i <= alunos){
            dados.nextLine();
            System.out.println("Informe o nome do " + i + "o aluno : ");
            nome[i - 1]= dados.nextLine();
            
            System.out.println("Informe a nota de " + nome[i - 1] + ": ");
            nota[i - 1]= dados.nextDouble();
            
            soma += nota[i - 1];
            
            
            if(nota[i - 1] > Mnota)Mnota = nota[i - 1];
            i++;
            
        }
        
        int indMnota = 0;
        for(int j = 0; j < alunos; j++){
            if(nota[j] == Mnota){
                indMnota = j;
                break;
            }
        }
        System.out.println("A maior nota da turma foi de " + nome[indMnota] + " com " + Mnota);
        System.out.println("A média da turma foi: " + soma/alunos);
   
  }
}



