import java.time.Year;

public class Caminhao extends VeiculoBase{

    private double capacidadeDeCarga;

    public Caminhao(String marca, String placa, int ano, double preco, double capacidade){
        super(marca,placa,ano,preco);
        this.capacidadeDeCarga = capacidade;


        if(marca == null || marca.isEmpty()){
            throw new IllegalArgumentException ("A marca não pode ser nula ou vazia!");
        }

        if(placa == null || placa.isEmpty()){
            throw new IllegalArgumentException ("A placa não pode ser nula ou vazia!");
        }

        if(ano < 1886){
            throw new IllegalArgumentException ("Ano inválido!");
        }

        if(preco < 0){
            throw new IllegalArgumentException ("Preço inválido!");
        }

        if(capacidade < 0){
            throw new IllegalArgumentException ("Capacidade inválida!");
        }
    }

    public double getCapacidade(){
        return capacidadeDeCarga;
    }

    public void setCapacidade(double novaCapacidade){
        this.capacidadeDeCarga = novaCapacidade;
    }


    public double calcularTaxaDeUso(){
        double taxa = super.getPreco() * 0.15; 
        return taxa;
    }

    public double calcularValorVenda(){
        int anoAtual = Year.now().getValue(); // Obtém o ano atual
        int anosDeUso = anoAtual - super.getAnoFabricacao();

        double taxaDepreciacao;
        if (capacidadeDeCarga <= 5) {
            taxaDepreciacao = 0.1; // 10% ao ano
        }else if(capacidadeDeCarga > 5 && capacidadeDeCarga < 10){
            taxaDepreciacao = 0.12; // 12% ao ano
        }
        else{
            taxaDepreciacao = 0.15; // 15% ao ano
        }

        // Calcula o valor de venda aplicando a depreciação anual
        double valor = super.getPreco() * Math.pow(1-taxaDepreciacao, anosDeUso);
        return valor;
    }

    @Override
    public String toString(){
        return "[Caminhão] " + super.toString() +
        "Capacidade de carga: " + capacidadeDeCarga + "\n";
    }
    
}
