
public class AssociaMuitosParaMutios
{
    public static void main(String[] args){
        
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        disciplina1.setCargaHoraria(80);
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Português");
        disciplina2.setCargaHoraria(80);
        
        Professor professor1 = new Professor();
        professor1.setNome("João");
        professor1.setMatricula(123);
        professor1.setFormacaoAcademica("Licenciado");
        professor1.setSalario(2000);
        
        Professor professor2 = new Professor();
        professor2.setNome("Maria");
        professor2.setMatricula(999);
        professor2.setFormacaoAcademica("Licenciada");
        professor2.setSalario(2500);
        
        //Relação João com Matemática//
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);
        
        //Relação João com Português//
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);
        
        //Relação Maria com Português//
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);
        
        //Listar disciplinas do professor João//
        System.out.println("Disciplinas do João: ");
        for(int i = 0; i < professor1.quantidadeDisciplina(); i++){
           Disciplina disciplina = professor1.getDisciplina(i);
           System.out.println(disciplina.getNome());
            //System.out.println(professor1.getDisciplina(i).getNome());//
        }
        System.out.println("*********************");
        //Listar disciplinas da professora Maria//
        System.out.println("Disciplinas da Maria: ");
        for(int i = 0; i < professor2.quantidadeDisciplina(); i++){
            Disciplina disciplina = professor2.getDisciplina(i);
            System.out.println(disciplina.getNome());
        }
        System.out.println("*********************");
        //Listar os professores de Português//
        System.out.println("Professores de português: ");
        for(int i = 0; i < disciplina2.quantidadeProfessor(); i++){
            System.out.println(disciplina2.getProfessor(i).getNome());
        }
        
        
    }
    

}
