import java.time.Year;

public class Motocicleta extends VeiculoBase {

    private static final double TAXA_DEPRECIACAO = 0.15; // Taxa de depreciação de 15% ao ano

    public Motocicleta(String marca, String placa, int ano, double preco){
        super(marca,placa,ano,preco);


         
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
            
    }


    public double calcularTaxaDeUso(){
        double taxa = super.getPreco() * 0.12; 
        return taxa;
    }

    public double calcularValorVenda(){
        int anoAtual = Year.now().getValue(); // Obtém o ano atual
        int anosDeUso = anoAtual - super.getAnoFabricacao();

        // Calcula o valor de venda aplicando a depreciação anual
        double valor = super.getPreco() * Math.pow(1-TAXA_DEPRECIACAO, anosDeUso);
        return valor;
    }

    @Override
    public String toString(){
        return "[Motocicleta] " + super.toString();
    }
    
}
