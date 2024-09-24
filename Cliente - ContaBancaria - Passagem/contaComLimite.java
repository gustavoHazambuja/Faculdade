
public class contaComLimite extends contaBancaria
{
    private double juros;
    private double taxaJuros;
    private double limite;
    
    public contaComLimite(int num, String nome){
        super(num,nome);
        this.juros = 0;
        this.limite = 0;
        this.taxaJuros = 0;
    }
    
    public double getJuros(){
        return juros;
    }
    
    public boolean quitaJuros(){
       if(getSaldo() >= juros){
           super.retirar(juros);
           juros = 0;
           return true;
       }
       return false;
        
    }
    
    public void defineLimite(double valorLimite){
        this.limite = valorLimite;
    }
    
    public void defineTaxaJuros(double valor){
        this.taxaJuros = valor;
    }
    
    @Override
    public boolean retirar(double valor) {
        if (valor > 0) {
            double saldoDisponivel = getSaldo();
            if (valor <= saldoDisponivel + limite) {
                if (valor > saldoDisponivel) {
                    double valorDescoberto = valor - saldoDisponivel;
                    double juros = valorDescoberto * taxaJuros / 100;
                    juros += juros;
                }
                saldoDisponivel -= valor;
                return true;
            }
        }
        return false; // Retirada maior que o saldo + limite
    }
    
    

   
}
