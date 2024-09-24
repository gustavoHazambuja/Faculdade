
public class Aluno
{
   
    private int idade;
    private double nota1, nota2, nota3;
    private String nome, disc, pet;
    
    public Aluno(int idade, double nota1, double nota2, double nota3, String nome,String disc, String pet){
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nome = nome;
        this.disc = disc;
        this.pet = pet;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
     public double getNota2(){
        return nota2;
    }
     public void setNota2(double nota2){
        this.nota2 = nota2;
    }
     public double getNota3(){
        return nota3;
    }
     public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDisc(){
        return disc;
    }
    public void setDisc(String disc){
        this.disc = disc;
    }
    public String getPet(){
        return pet;
    }
    public void setPet(String pet){
        this.pet = pet;
    }
    
    public String toString(){
        return "\n Nome do aluno = " + nome + "\n Disciplina = " + disc + "\n Idade = " + idade + "\n Nota1 = " + nota1 + "\n Nota2 = " + nota2 + "\n Nota3 = " + nota3 + "\n Nome do pet = " + pet;
        
    }
    

    
}
