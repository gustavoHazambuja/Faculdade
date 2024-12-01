public class Peixe extends Animal {
    
    private String tipoDeNadadeira;

    public Peixe(String nome, int idade, String nadadeira){
        super(nome, idade);
        this.tipoDeNadadeira = nadadeira;
    }

    public String getTipoDeNadadeira(){
        return tipoDeNadadeira;
    }

    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    @Override
    public String toString(){
        return String.format("[Peixe] " + super.getString() + "\nTipo de nadedeira: %s", tipoDeNadadeira);
    }
}
