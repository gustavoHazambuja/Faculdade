

public class Main
{
    public static void main(String[] args){
        GerenciadorDeClientes gerenciador =  new GerenciadorDeClientes();
        
        gerenciador.adicionarCliente(new clienteFisico("GU",18,100));
        
        gerenciador.adicionarCliente(new clienteJuridico("JU",200));
        
        gerenciador.mostrarClientes();
    }
   

   
}
