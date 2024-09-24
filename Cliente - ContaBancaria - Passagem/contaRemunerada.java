
public class contaRemunerada extends contaBancaria
{
    private double percentRemuneracao;
    
    public contaRemunerada(int num, String nome){
        super(num,nome);
        this.percentRemuneracao = 0;
    }
    
    
    public void definePercentRemuneracao(double valor){
        this.percentRemuneracao = valor;       
    }
    
    
    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            double valorRemunerado = valor + (valor * percentRemuneracao / 100);
            return super.depositar(valorRemunerado); // Realiza o depósito com remuneração
        }
        return false;
    }

   
}
