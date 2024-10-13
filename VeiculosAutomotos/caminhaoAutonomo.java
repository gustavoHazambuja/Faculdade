public class caminhaoAutonomo extends veiculoAutonomo {
    
    public caminhaoAutonomo(int capacidade, String destino, boolean emRota, boolean carregada){
        super( 5000,destino, emRota, carregada);
        setTipos("Caminhão");
    }

    public String exibirStatus(){
        return "Tipo de veículo: " + super.getTipos() + "\n" +
        "Capacidade de carga: " + super.getCapacidade() + "kg" + "\n" +
        "Peso atual: " + super.getPeso() + "\n" +
        "Destino atual: " + super.getDestinoAtual() + "\n" +
        "Veículo em rota: " + super.isEmRota() + "\n" +
        "Veículo carregado: " + super.isCarregada();
    }
}
