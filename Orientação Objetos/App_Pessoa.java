import java.util.Scanner;
public class App_Pessoa
 {  
     public static void main(String args[]){
         
           Pessoa pessoa1 = new Pessoa(1,"Pedro");
           
           Pessoa pessoa2 = new Pessoa(2, "Valdemar");
           
           System.out.println("O nome do código da pessoa1 é: " + pessoa1.getCodigo());
           
           System.out.println("O nome da pessoa1 é: " + pessoa1.getNome());
           
           pessoa1.setNome("João Pedro");
           
           System.out.println("O novo nome da pessoa1 é: " + pessoa1.getNome());
           
           System.out.println("O novo nome da pessoa2 é: " + pessoa2.getNome());
           
     }
        
    
}

    

