import java.util.ArrayList;

public class sistemaDeTransporte {
    private ArrayList<veiculoAutonomo> veiculos;

    public sistemaDeTransporte(){
        this.veiculos = new ArrayList<veiculoAutonomo>();
    }

    public void adicionarVeiculo(veiculoAutonomo veiculo){
        veiculos.add(veiculo);
    }

    public void iniciarRotaVeiculo(String destino){
        for(veiculoAutonomo v: veiculos){
            v.iniciarRota(destino);
        }
    }

    public void carregarVeiculo(int indice, int peso){
        for(veiculoAutonomo v: veiculos){
            v.carregar(indice, peso);
        }
    }

    public void descarregar(int indice){
        for(veiculoAutonomo v: veiculos){
            v.descarregar(indice);
        }
    }

    public void monitorarTodos(){
        for(veiculoAutonomo v: veiculos){
            v.monitorarPosicao();
        }
    }

    public void exibirStatus(){
        for(veiculoAutonomo v: veiculos){
            System.out.println(v.exibirStatus());
            System.out.println("**********************");
        }
    }
}
