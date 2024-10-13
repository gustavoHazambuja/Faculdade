public class droneAutonomo extends veiculoAutonomo {
    

    public droneAutonomo(int capacidade, String destino, boolean emRota, boolean carregada){
        super(50, destino, emRota, carregada);
        setTipos("Drone");

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
