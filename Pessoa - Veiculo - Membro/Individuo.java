
public class Individuo extends Membro
{
    private int idade;
    private double salario;
    
    public Individuo(String nome, int idade, double sal){
        super(nome);
        this.idade = idade;
        this.salario = sal;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double getMensalidade(){
        double mensalidade = salario * 0.12;
        
        return mensalidade;
        
    }
    
    @Override
    public String toString(){
        return "[Indivíduo]: " + super.toString() +
        " / " + "Idade: " + idade +
        " / " + "Salário: " + salario +
        " / " + "Mensalidade: " + getMensalidade();
        
    }
    

    
}
