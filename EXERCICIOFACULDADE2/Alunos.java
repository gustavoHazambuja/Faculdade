import java.util.Scanner;
public class Alunos
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        double maior = Integer.MIN_VALUE;
        double soma = 0;
        int alunos;
        
        
        double medNota = 0;
        
        System.out.println("Quantos alunos tem a turma: ");
        alunos = sc.nextInt();
        
        String [] nome = new String[alunos];
        double[] nota = new double[alunos];
        
        do{
            sc.nextLine();
            System.out.println("Informe o nome do(a) aluno(a)" + contador + ": ");
            nome [contador - 1]= sc.nextLine();
            System.out.println("Informe a nota de " + nome[contador - 1] + ": ");
            nota [contador - 1]= sc.nextDouble();
            soma += nota[contador - 1];
            if(nota[contador - 1] > maior)
              maior = nota[contador - 1];
            contador++;
            
            
        }while(contador <= alunos);
        
        if(alunos > 0){
            System.out.println("A média de notas da turma é de: " + soma/alunos);
            System.out.println("A maior nota da turma foi: " + maior);
        }
        
    }
        
}
        

    

  
