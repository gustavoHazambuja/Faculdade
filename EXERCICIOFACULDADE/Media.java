import java.util.Scanner;
public class Media
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        double nota1,nota2;
        System.out.println("Informe a nota1: ");
        nota1 = dados.nextDouble();
        System.out.println("Informe a nota2: ");
        nota2 = dados.nextDouble();
        System.out.println("Média: " + ((nota1+nota2))/2);
        if(((nota1+nota2)/2) >=7){
            System.out.println("Aluno aprovado: ");
        }else if(((nota1+nota2)/2) <=6){
            System.out.println("Aluno reprovado: ");
        }   
        else{ 
            System.out.println("Aluno em recuperação: ");
                
        }
    }
        
 }
            
 
                
  