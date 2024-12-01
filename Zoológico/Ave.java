public class Ave extends Animal {
    
    private double tamanhoAsa;

    public Ave(String nome, int idade, double tamanhoAsa){
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;
    }

    public double getTamnhoAsa(){
        return tamanhoAsa;
    }

    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    public void voar(){
        System.out.println(getNome() + " está voando!");
    }

    @Override
    public String toString(){
        return String.format("[Ave] " + super.getString() + "\nTamanho da asa: %s", tamanhoAsa);
    }
}
