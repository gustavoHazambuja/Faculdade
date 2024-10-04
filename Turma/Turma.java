public class Turma{
    private String[] alunos;
    private int qtd = 0;

    public Turma(int nroMaxAlunos){
        this.alunos = new String[nroMaxAlunos];
    }


    public boolean matricularAluno(String nomeAluno){
        for(int i = 0; i <alunos.length; i++){
            alunos[i] = nomeAluno;
            qtd++;
            return true;
        }
        return false;
    }

    public String buscar(String str){
        for (int i = 0; i < alunos.length; i++) {
            String nomei = alunos[i];
            if(nomei.contains(str)){
                return nomei;
            }
        }
        return null;
    }

    public int getQtdAlunosMatriculados(){
        return qtd;
    }

    public int getQtdVagasDisponiveis(){
        return alunos.length - qtd;
    }
}