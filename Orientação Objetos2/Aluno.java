
public class Aluno
{
    private Pessoa alguem;
    private String curso;
    private int semestre, creditos;
    
    public Aluno(Pessoa alguem1, String curso1, int creditos1,int semestre1 )
    {
        this.alguem=alguem1;
        this.setCurso(curso1);
        this.setSemestre (semestre1);
        this.setCreditos(creditos1);
        
    }
    public void setCurso( String curso1){ 
        this.curso=curso1;
    }
    public void setSemestre (int semestre1){
        this.semestre=semestre1;
    }
    public void setCreditos (int creditos1){
        this.creditos=creditos1;
    }
    public String getCurso() {
        return curso;
    }
    public int getSemestre() {
        return semestre;
    }
    public int getCreditos(){
        return creditos;
    }
    
    public String toString() { 
     return alguem+ "\n Esta cursando: "+curso + "\n no "+ semestre+ "\n semestre" +
       "\n fazendo "+ creditos + " creditos";
    }
    
}
