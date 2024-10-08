
import java.util.ArrayList;

public class Turma 
{
    private String sigla;
    private int ano;
    
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    
    public Turma(){
        alunos = new ArrayList<Aluno>();
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public int quantidadeAluno(){
        return alunos.size();
    }
    public void excluirAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    public Aluno getAluno(int posicao){
        return alunos.get(posicao);
    }
    
    void adicionarAluno(){
        
    }
    public String getSigla(){
        return sigla;
    }
    public void setSigla(String silga){
        this.sigla = sigla;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
       this.ano = ano;
    }
    
}
