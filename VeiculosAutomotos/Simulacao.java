public class Simulacao {
    public static void main(String[] args) {
        sistemaDeTransporte sistema = new sistemaDeTransporte();


        sistema.adicionarVeiculo(new carroAutonomo( 500,"Porto Alegre", true, true));

        sistema.adicionarVeiculo(new caminhaoAutonomo(5000, "Florianópolis", true, true));

        sistema.adicionarVeiculo(new droneAutonomo(50, null, false, false));


        sistema.iniciarRotaVeiculo("Porto Alegre");

        sistema.carregarVeiculo(0, 40);

        sistema.descarregar(0);

        sistema.monitorarTodos();

        sistema.exibirStatus();
    }
}
