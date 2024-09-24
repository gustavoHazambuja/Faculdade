import java.util.*;

public class ListaPacientes
{
    private List<Paciente> pacientes;
    
    public ListaPacientes(){
        this.pacientes = new ArrayList<>();
    }
    
    public void cadastrarPaciente(Paciente paciente){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (paciente.getCodigo()) && (p.getNome() == (paciente.getNome())) || (p.getCodigo() == (paciente.getCodigo()))){
                System.out.println("Erro! Já existe paciente com o mesmo nome ou código já cadastrado ");
                return;
            }
        }
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso! ");
        
    }
    
    public Paciente consultaPacientePorNome(String nome){
        for(Paciente p: pacientes){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        System.out.println("Erro! Paciente com esse nome não encontrado ");
        return null;
    }
    
    public Paciente consultaPacientePorCodigo(int codigo){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                return p;
            }
        }
        System.out.println("Erro! Paciente com esse código não encontrado ");
        return null;
    }
    
    public void MostrarPacienteAcimaIdade(int idade){
        boolean encontrou = false;
        for(Paciente p: pacientes){
            if(p.getIdade() > (idade)){
                System.out.println(p);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhum paciente acima dessa idade informada ");
        }
    }
    
    public void listarPacientes(){
        if(pacientes.isEmpty()){
               System.out.println("Nenhum paciente cadastrado ");
               
        }else{
            for(Paciente p: pacientes){
                System.out.println(p);
            }
        }  
    }
    
    public void alterarPesoPacientePorCodigo(int codigo, double novoPeso){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                p.setPeso(novoPeso);
                System.out.println("Peso alterado com sucesso! ");
                return;
            }
        }
        System.out.println("Nenhum paciente com esse código cadastrado! ");
    }
    
    public void alterarAlturaPacientePorCodigo(int codigo, double novaAltura){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                p.setAltura(novaAltura);
                System.out.println("Altura alterada com sucesso! ");
                return;
            }
        }
         System.out.println("Nenhum paciente com esse código cadastrado! ");
    }
    
    public void alterarSexoPacientePorCodigo(int codigo, String novoSexo){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                p.setSexo(novoSexo);
                System.out.println("Sexo alterado com sucesso! ");
                return;
            }
        }
        System.out.println("Nenhum paciente com esse código cadastrado! ");
    }
    
    public void mostrarIMCPorCodigo(int codigo){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                p.calcularIMC(p.getPeso(),p.getAltura());
                return;
            }
        }
        System.out.println("Nenhum paciente com esse código cadastrado! ");
    }
    
    public void mostrarPesoIdealPorCodigo(int codigo){
        for(Paciente p: pacientes){
            if(p.getCodigo() == (codigo)){
                p.calcularPesoIdeal(p.getPeso(),p.getAltura(),p.getSexo());
                return;
            }
        }
        System.out.println("Nenhum paciente com esse código cadastrado! ");
    }
    
   
}
