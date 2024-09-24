

public class Veiculo
{
    private static String placaGeral = "VEH1000";
    
    private String placa;
    private int anoFabricacao;
    
    public Veiculo(int ano){
        this.placa = gerarProximaPlaca();
        this.anoFabricacao = ano;
    }
    
    private static String gerarProximaPlaca(){
        // Separa o prefixo "VEH" e a parte numérica da placa
        String letras = placaGeral.substring(0,3); // Extrai as letras "VEH"
        String numeros = placaGeral.substring(3); // Extrai a parte numérica "1000"

        // Converte a parte numérica para um número inteiro e incrementa
        int numeroAtual = Integer.parseInt(numeros);
        numeroAtual++;

        // Atualiza a placaGeral com o novo número
        placaGeral = letras + numeroAtual;

        // Retorna a nova placa
        return placaGeral;
    }
    
    public String getPlaca(){
        return placa;
    }
    public int getanoFabricacao(){
        return anoFabricacao;
    }
    
    @Override
    public String toString(){
        return "PLACA: " + placa +" /" + " Ano de Fabricação: " + anoFabricacao;
    }
    
}
    
    
   

   

