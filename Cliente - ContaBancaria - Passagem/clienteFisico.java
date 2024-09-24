
public class clienteFisico extends Cliente
{
    private int idade;
    private double salario;
    
    public clienteFisico(String nome, int idade, double sal){
        super(nome);
        this.idade = idade;
        this.salario = sal;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getsalario(){
        return salario;
    }
    
    public void setIdade(int umaIdade){
        this.idade = umaIdade;
    }
    
    public double getMensalidade(){
        double mensalidade;
        if(idade < 60){
            mensalidade = salario * 0.1;
        }
        else{
            mensalidade = salario * 0.15;
        }
        return mensalidade;
    }
    
    
    public void setSalario(double novoSalario){
        if(novoSalario > 0 && novoSalario > salario){
            this.salario = novoSalario;
        }
    }
    
    @Override
    public String toString(){
        return "[Cliente Físico] " + super.toString() +
        " / " + "Idade: " + idade + 
        " / " + "Salário: " + "R$ "+ salario + 
        " / " + "Mensalidade: " + "R$ " + getMensalidade();
    }
  

}
