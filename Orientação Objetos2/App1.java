import java.util.Scanner;
public class App1 {
    
        
                      
        public static void main (String[]args )
        {
       Scanner entrada=new Scanner(System.in);
       Pessoa eu;
       Aluno tu;
       
       System.out.println("\f");
       System.out.println("\n Digite nome ");
       String nome1=entrada.nextLine();
       System.out.println("\n Digite endereco ");
       String endereco1=entrada.nextLine();
       System.out.println("\n Digite nome da mãe ");
       String mae1=entrada.nextLine();
       System.out.println("\n Digite nome do pai");
       String pai1=entrada.nextLine();
       System.out.println("\n Digite cidade onde nasceu ");
       String cidade1=entrada.nextLine();
       System.out.println("\n Digite dia que nasceu ");
       int dia1=entrada.nextInt();
       System.out.println("\n Digite mes que nasceu ");
       int mes1=entrada.nextInt();
       System.out.println("\n Digite ano que nasceu ");
       int ano1=entrada.nextInt();
       System.out.println("\n Digite RG ");
       int rg1=entrada.nextInt();
       System.out.println("\n Digite CPF ");
       int cpf1=entrada.nextInt();
       //instanciando o objeto pessoa
       eu=new Pessoa( nome1,endereco1,cidade1,dia1,mes1,ano1,cpf1,rg1);
       /// comecando as informações para o 2o objeto
       entrada.nextLine();
       System.out.println("\n Digite nome do curso ");
       String curso1=entrada.nextLine();
       System.out.println("\n Digite quantidade de creditos matriculados ");
       int creditos1=entrada.nextInt();
       System.out.println("\n Digite o semestre em que se  matriculou ");
       int semestre1=entrada.nextInt();
       //instanciando o objeto aluno
       tu=new Aluno(eu, curso1,creditos1,semestre1);
                  
       System.out.println ("\n dados do Aluno Matriculado");
       System.out.println (" **************************");
       
       System.out.println (tu);
       
       System.out.println ("\n nome do Aluno Matriculado"+ eu.getNome());
       System.out.println ("\n Fim de Programa");
       
}
}