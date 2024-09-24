import java.util.Scanner;
public class Var_CompostaTurma {
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        String[] nome = new String[4];
        double[] nota1 = new double[4];
        double[] nota2 = new double[4];
        double[] media = new double[4];
        double somaM = 0;
        double somaTur = 0;
        int tot = 0;
        
        for(int i = 1; i <= 4; i++){
            System.out.println("Informe o nome do aluno " + i);
            nome[i - 1] = dados.nextLine();
            System.out.println("Informe a primeira nota: ");
            nota1[i - 1] = dados.nextDouble();
            System.out.println("Informe a segunda nota: ");
            nota2[i - 1] = dados.nextDouble();
            dados.nextLine();
            media[i - 1] = (nota1[i - 1] + nota2[i - 1])/2;
            somaM += media[i - 1];
        }
        somaTur = somaM/4;
        System.out.println("LISTAGEM DE ALUNOS");
        for(int i = 1; i <= 4; i++){
            System.out.println(nome[i - 1] + " Sua média foi " +  media[i - 1]);
            if(media [i - 1] > somaTur){
                tot++;
            }
        }
        System.out.println("Ao todo temos " + tot + " alunos acima da média da turma que é " + somaTur);
       
    }
}
