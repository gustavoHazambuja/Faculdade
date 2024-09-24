import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeClientes
{
    private ArrayList<Cliente> clientes;
   
    public GerenciadorDeClientes(){
        clientes = new ArrayList<Cliente>();
    }
    
    public void adicionarClienteFisico(clienteFisico cf){
        clientes.add(cf);
        System.out.println("Cliente físico adicionado com sucesso! ");
    }
    
    public void adicionarClienteJuridico(clienteJuridico cj){
        clientes.add(cj);
        System.out.println("Cliente jurídico adicionado com sucesso! ");
    }
    
    public void adicionarCliente(Cliente cl){
        clientes.add(cl);
    }
    
    public void mostrarClientes(){
        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado! ");
        }
        else{
            for(Cliente c: clientes){
                System.out.println(c);
            }
        }
    }

    
}
