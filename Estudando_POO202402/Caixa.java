
import java.util.*;

public class Caixa
{
    private List<Cliente> fila;
    
    private int capMaxAtendimento;
    private int id;
    private static enum EstadoCaixa{Funcionando,Parado};
    private static final double CHANCE_AVANCAR = 0.5;
    
    private EstadoCaixa estado;
    
    public Caixa(int capMaxAtendimento, int id){
        this.capMaxAtendimento = capMaxAtendimento;
        this.id = id;
        this.fila = new ArrayList<>();
        this.estado = EstadoCaixa.Funcionando;
    }
    
    public boolean adicionarCliente(Cliente cliente){
        if(estado == EstadoCaixa.Funcionando && !estaCheio()){
            return fila.add(cliente);
        }else{
            return false;
        }
    }
    
    public int qtdClientesNaFila(){
        return fila.size();
    }
    
    public boolean estaCheio(){
        return fila.size() >= capMaxAtendimento;
    }
    
    public boolean avancarAtendimento(){
        if(Math.random() < CHANCE_AVANCAR){
            return false;
        }else{
            fila.remove(0);
            return true;
        }
        
    }
    

    
}
