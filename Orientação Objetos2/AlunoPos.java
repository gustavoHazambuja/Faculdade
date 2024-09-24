public class AlunoPos
{
    private Aluno alguem;
    private String orientador, linha;
    
    
    public AlunoPos(Aluno alguem1, String orientador1, String linha1){
        this.alguem=alguem1;
        this.setOrientador(orientador1);
        this.setLinha(linha1);
    }
            
    public void setOrientador( String orientador1){
        this.orientador=orientador1;
    }
    public void setLinha (String linha1){
        this.linha=linha1;
    }
    public String getOrientador() {
        return orientador;
    }
    public String getLinha() {
        return linha;
    }
    
        
    public String toString() { 
     return alguem+ "\n Esta sendo orientado por : "+ orientador+ "\n na linha de pesquisa "+ linha;
    }
    
}
