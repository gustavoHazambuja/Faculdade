
public class Paciente
{
    private int codigo;
    private String nome;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;
    
    public Paciente(int codigo, String nome, String sexo, double peso ,double altura,int idade){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void calcularIMC(double peso,double altura){
        double IMC = peso / Math.pow(altura,2);
        System.out.println("O IMC do(a) paciente é: " + IMC);
    }
    
    public void calcularPesoIdeal(double peso,double altura, String sexo){
        if(sexo.equals("M")){
            double pesoIdealM = 72.7 * altura - 58;
            System.out.println("O peso ideal do paciente é: " + pesoIdealM);
        }else if(sexo.equals("F")){
            double pesoIdealF = 62.1 * altura - 44.7;
            System.out.println("O peso ideal da paciente é: " + pesoIdealF);
        }else{
            System.out.println("Sexo inválido! ");
        }
    }
    
    public String toString(){
        return "Nome: " + nome + "\n Idade: " + idade + "\n Código " + codigo + "\n Sexo: " + sexo + "\n Peso: " + peso + "\n Altura: " + altura;
    }
    
    

    
}
