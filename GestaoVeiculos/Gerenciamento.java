import java.util.ArrayList;

public class Gerenciamento{

    private ArrayList<VeiculoBase> veiculos;

    public Gerenciamento(){
        this.veiculos = new ArrayList<VeiculoBase>();
    }

    public void adicionarVeiculo(VeiculoBase veiculo){
        veiculos.add(veiculo);
    }

    public void removerVeiculo(VeiculoBase veiculo){
        veiculos.remove(veiculo);
    }

    public VeiculoBase buscarVeiculoPorPlaca(String placa) throws Exception{
        for(VeiculoBase v: veiculos){
            if(v.getPlaca() != null && v.getPlaca().equals(placa)){
                System.out.println("Veículo encontrado!");
                System.out.println(v);
                return v;
            } 
        }
        throw new Exception("Veículo não encontrado!");
    }     
            
    public VeiculoBase buscarVeiculoPorMarca(String marca) throws Exception{
        for(VeiculoBase v: veiculos){
            if(v.getMarca() != null && v.getMarca().equals(marca)){
                System.out.println("Veículo encontrado!");
                System.out.println(v);
                return v;
            } 
        }
        throw new Exception("Veículo não encontrado!");
    }

    public VeiculoBase buscarVeiculoPorAnoDeFabricacao(int ano) throws Exception{
        for(VeiculoBase v: veiculos){
            if(v.getAnoFabricacao() == (ano)){
                System.out.println("Veículo encontrado!");
                System.out.println(v);
                return v;
            } 
        }
        throw new Exception("Veículo não encontrado!");
    }

    public void venderVeiculo(VeiculoBase veiculo) throws Exception{
        if(veiculos.contains(veiculo) && veiculo.podeSerVendido()){
            veiculo.venderVeiculo();
        }
        else{
            throw new Exception("Veículo já foi vendido ou alugado, ou não está na lista");
        }
    }

    public void alugarVeiculo(VeiculoBase veiculo) throws Exception{
        if(veiculos.contains(veiculo) && veiculo.podeSerAlugado()){
            veiculo.alugarVeiculo();
        }
        else{
            throw new Exception("Veículo já foi alugado ou vendido, ou não está na lista");
        }
    }

    public void listarVeiculos() throws Exception{
        
            if(veiculos.isEmpty()){
                throw new Exception("Nenhum veículo na lista!");
            }
            else{
                System.out.println("Lista de veículos: ");
                for(VeiculoBase v: veiculos){
                    System.out.println(v);
                }   
        }
    }
        
      
    

    public void calcularValorVenda(){
        for (VeiculoBase v : veiculos) {
            double valor = v.calcularValorVenda();
            System.out.printf("Valor de venda do veículo: " + "(" + v.getMarca() +") " +  " R$ %.3f\n", valor);

        }
    }

    public void calcularTaxaDeUso(){
        for (VeiculoBase v : veiculos) {
            double valor = v.calcularTaxaDeUso();
            System.out.printf("Valor de taxa do veículo: " + "(" + v.getMarca() +") " +   " R$ %.3f\n", valor);

        }
    }
    
}