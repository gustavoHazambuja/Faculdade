import java.util.Scanner;


public class App_Aluno2_0
{
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno(20, 6.0, 8.0, 8.5, "Eduardo", "Português", "Belinha");
        
        Aluno aluno2 = new Aluno(19, 5.0, 6.5, 9.0, "Carlos", "Química", "Tati");
        
        Aluno aluno3 = new Aluno(21, 7.0, 8.0, 10.0, "Rogério", "Matemática", "Megui");
        
        
        System.out.println("Informações do aluno1: ");
        System.out.println("Informe o nome do aluno1: ");
        String nome = dados.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = dados.nextInt();
        System.out.println("Informe o nome da disciplina: ");
        String disc = dados.nextLine();
        System.out.println("Informe o nome do seu pet: ");
        String pet = dados.nextLine();
        System.out.println("Informe a nota 1: ");
        double nota1 = dados.nextDouble();
        System.out.println("Informe a nota 2: ");
        double nota2 = dados.nextDouble();
        System.out.println("Informe a nota 3: ");
        double nota3 = dados.nextDouble();
        
        
        System.out.println("***************************");
        System.out.println("Informações do aluno2: ");
         System.out.println("Informe o nome do aluno2: ");
         nome = dados.nextLine();
        System.out.println("Informe a sua idade: ");
         idade = dados.nextInt();
        System.out.println("Informe o nome da disciplina: ");
         disc = dados.nextLine();
        System.out.println("Informe o nome do seu pet: ");
         pet = dados.nextLine();
        System.out.println("Informe a nota 1: ");
         nota1 = dados.nextDouble();
        System.out.println("Informe a nota 2: ");
         nota2 = dados.nextDouble();
        System.out.println("Informe a nota 3: ");
         nota3 = dados.nextDouble();
       
        System.out.println("***************************");
        System.out.println("Informações do aluno3: ");
         System.out.println("Informe o nome do aluno3: ");
         nome = dados.nextLine();
        System.out.println("Informe a sua idade: ");
         idade = dados.nextInt();
        System.out.println("Informe o nome da disciplina: ");
         disc = dados.nextLine();
        System.out.println("Informe o nome do seu pet: ");
         pet = dados.nextLine();
        System.out.println("Informe a nota 1: ");
         nota1 = dados.nextDouble();
        System.out.println("Informe a nota 2: ");
         nota2 = dados.nextDouble();
        System.out.println("Informe a nota 3: ");
         nota3 = dados.nextDouble();
      
        
    }

    
}
