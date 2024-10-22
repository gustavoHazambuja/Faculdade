import java.util.Objects;

public abstract class VeiculoBase implements Veiculo {
    
    private String marca;
    private String placa;
    private int anoFabricacao;
    private double preco;

    private boolean taVendido;
    private boolean taAlugado;

    public VeiculoBase(String marca, String placa, int ano, double preco){
        this.marca = marca;
        this.placa = placa;
        this.anoFabricacao = ano;
        this.preco = preco;

        this.taAlugado = false;
        this.taVendido = false;
    }

    public String getMarca(){
        return marca;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public double getPreco(){
        return preco;
    }

    
    public abstract double calcularTaxaDeUso();

    public abstract double calcularValorVenda();
    
    public boolean podeSerVendido(){
        if(taAlugado == true){
            return false;
        }
        return true;
    }

    public void venderVeiculo(){
        if(taAlugado == true){
            System.out.println("Veículo está alugado!");
        }
        else{
            System.out.println("Veículo vendido!");
            this.taVendido = true;
        }
    }

    public boolean podeSerAlugado(){
        if(taVendido == true){
            return false;
        }
        return true;
    }

    public void alugarVeiculo(){
        if(taVendido == true){
            System.out.println("Veículo já vendido!");
        }
        else{
            System.out.println("Veículo alugado!");
            this.taAlugado = true;
        } 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Verifica se é a mesma instância
        if (obj == null || getClass() != obj.getClass()) return false;  // Verifica se é do mesmo tipo
        VeiculoBase that = (VeiculoBase) obj;  // Faz o casting para VeiculoBase
          // Compara os atributos relevantes (placa, ano de fabricação e marca)
        return this.placa.equals(that.placa) &&
        this.anoFabricacao == that.anoFabricacao &&
        this.marca.equals(that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, anoFabricacao, marca);  // Retorna o hash baseado na placa
}


    public String toString() {
        return String.format(
            "Marca: %s\n" +
            "Placa: %s\n" +
            "Ano de fabricação: %d\n" +
            "Preço Inicial: R$ %.3f\n" +
            "Preço de venda: R$ %.3f\n" +
            "Taxa de uso: R$ %.3f\n",
            marca, 
            placa, 
            anoFabricacao, 
            preco, 
            calcularValorVenda(),
            calcularTaxaDeUso()
        );
    }
    

}
