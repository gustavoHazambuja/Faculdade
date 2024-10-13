public abstract class veiculoAutonomo implements Carregavel,Navegavel{
    

    private String tipos;
    private int capacidade;
    private int peso;
    private String destinoAtual;
    private boolean emRota;
    private boolean carregada;

    public veiculoAutonomo(int capacidade, String destino, boolean emRota, boolean carregada){
        this.capacidade = capacidade;
        this.peso = 0;
        this.destinoAtual = destino;
        this.emRota = emRota;
        this.carregada = carregada;

    }

    public String getTipos(){
        return tipos;
    }
    
    public void setTipos(String tipos){
        this.tipos = tipos;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public int getPeso(){
        return peso;
    }

    public String getDestinoAtual(){
        return destinoAtual;
    }

    public boolean isEmRota(){
        return emRota;
    }

    public boolean isCarregada(){
        return carregada;
    }

    public abstract String exibirStatus();

    public void carregar(int indice, int peso){
        assert peso <= this.capacidade: "Peso do item superior que a capacidade máxima!";
        this.peso = peso;
        this.carregada = true;
    }

    public void descarregar(int indice){
        this.peso = 0;
        this.carregada = false;
        System.out.println("Item descarregado!");
    }

    public void iniciarRota(String destino){
        this.destinoAtual = destino;
        this.emRota = true;
    }

    public void parar(){
        this.emRota = false;
        System.out.println("Rota parada!");
    }

    public void monitorarPosicao(){
        System.out.println("Monitorando a posição atual...");
    }
    
}
