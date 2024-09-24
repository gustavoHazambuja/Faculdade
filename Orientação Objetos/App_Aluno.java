

public class App_Aluno
{
    public static void main(String[]args){
        
        Aluno aluno1 = new Aluno(20, 6.0, 8.0, 8.5, "Eduardo", "Português", "Belinha");
        
        Aluno aluno2 = new Aluno(19, 5.0, 6.5, 9.0, "Carlos", "Química", "Tati");
        
        Aluno aluno3 = new Aluno(21, 7.0, 8.0, 10.0, "Rogério", "Matemática", "Megui");
        
        
        System.out.println("Informações do aluno1: ");
        System.out.println("O nome do aluno1 é: " + aluno1.getNome());
        System.out.println("A idade do aluno1 é: " + aluno1.getIdade()); 
        System.out.println("A nota1 do aluno1 foi: " + aluno1.getNota1());
        System.out.println("A nota2 do aluno1 foi: " + aluno1.getNota2());
        System.out.println("A nota3 do aluno1 foi: " + aluno1.getNota3()); 
        System.out.println("Sua disciplina favorita é: " + aluno1.getDisc());
        aluno1.setDisc("Química");
        System.out.println("Sua nova disciplina favorita é: "+ aluno1.getDisc());
        System.out.println("O nome do pet é: " + aluno1.getPet());
        System.out.println(aluno1);
        
        System.out.println("***************************");
        System.out.println("Informações do aluno2: ");
        System.out.println("O nome do aluno2 é: " + aluno2.getNome());
        System.out.println("A idade do aluno2 é: " + aluno2.getIdade()); 
        System.out.println("A nota1 do aluno2 foi: " + aluno2.getNota1());
        System.out.println("A nota2 do aluno2 foi: " + aluno2.getNota2());
        System.out.println("A nota3 do aluno2 foi: " + aluno2.getNota3()); 
        System.out.println("Sua disciplina favorita é: " + aluno2.getDisc());
        System.out.println("O nome do pet é: " + aluno2.getPet());
        System.out.println(aluno2);
        
        System.out.println("***************************");
        System.out.println("Informações do aluno3: ");
        System.out.println("O nome do aluno3 é: " + aluno3.getNome());
        System.out.println("A idade do aluno3 é: " + aluno3.getIdade()); 
        System.out.println("A nota1 do aluno3 foi: " + aluno3.getNota1());
        System.out.println("A nota2 do aluno3 foi: " + aluno3.getNota2());
        System.out.println("A nota3 do aluno3 foi: " + aluno3.getNota3()); 
        System.out.println("Sua disciplina favorita é: " + aluno3.getDisc());
        System.out.println("O nome do pet é: " + aluno3.getPet());
        System.out.println(aluno3);
        
        System.out.println("**************************");
        double media1 = (aluno1.getNota1() + aluno1.getNota2() + aluno1.getNota3())/3;
        
        double media2 = (aluno2.getNota1() + aluno2.getNota2() + aluno2.getNota3())/3;
        
        double media3 = (aluno3.getNota1() + aluno3.getNota2() + aluno3.getNota3())/3;
        
        
        System.out.println("A média do aluno1 é: " + media1);
        System.out.println("A média do aluno2 é: " + media2);
        System.out.println("A média do aluno3 é: " + media3);
        
        System.out.println("**********************");
        
        double mediaGeral = (media1 + media2 + media3)/3;
        System.out.println("A média das médias dos alunos é: " + mediaGeral);
        
    }

    
}
