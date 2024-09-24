public class Funcionario_ {

    private int anoContratacao;
    private String nome;
    private double salario;

    public Funcionario_(int ano, String nome, double sal) {
        this.anoContratacao = ano;
        this.nome = nome;
        this.salario = sal;

    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double novoSalario) {
        if (novoSalario > 0.0 && novoSalario > salario) {
            salario = novoSalario;
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        return "Nome: " + nome + "\nAno de contratação: " + anoContratacao + "\nSalário: " + salario;
    }

}
