public class Aluno {
    private String nome;
    private int nroMatricula;
    private int anoIngresso;

    public Aluno(String nome, int matricula, int ano){
        this.nome = nome;
        this.nroMatricula = matricula;
        this. anoIngresso = ano;
    }

    public String getNome(){
        return nome;
    }

    public int getNroMatricula(){
        return nroMatricula;
    }

    public int getAnoIngresso(){
        return anoIngresso;
    }



}
