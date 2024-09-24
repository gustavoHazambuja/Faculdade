

public class Funcionario
{
    private int idFuncionario;
    private String nome;
    private int dataContratacao;
    private double salarioHora;
    
    public Funcionario(int id, String nome, int dataContratacao,double salarioHora){
        this.idFuncionario = id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salarioHora = salarioHora;
    }
    
    public int getIdFuncionario(){
        return idFuncionario;
    }
    public String getNome(){
        return nome;
    }
    public int getDataContratacao(){
        return dataContratacao;
    }
    public double getSalarioHora(){
        return salarioHora;
    }
    public boolean setSalarioHora(double novoSalarioHora){
        if(novoSalarioHora > 0.0 && novoSalarioHora > salarioHora){
            salarioHora = novoSalarioHora;
            return true;
        }else{
            return false;
        }
    }
    
    public int numHorasTrabalhadasDia(){
        int entrada = 10;
        int saida = 17;
        int calc = saida - entrada;
        
        return calc;
        
    }
    
    public int numHorasTrabalhadasSemana(){
        int totalDiario = 7;
        int totalSemana = 7 * 5;
        
        return totalSemana;
    }
    
    public double salarioBrutoSemana(){
        double salarioDia = salarioHora * 7;
        double salarioSemana = salarioDia * 5;
        
        return salarioSemana;
        
    }
    
}
