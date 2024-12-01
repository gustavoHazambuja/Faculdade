public class Anfibio extends Animal{
    
    private String tipoPele;

    public Anfibio(String nome, int idade, String pele){
        super(nome, idade);
        this.tipoPele = pele;
    }

    public String getTipoPele(){
        return tipoPele;
    }

    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    public void mudarAmbiente(){
        System.out.println(getNome() + " está mudando de ambiente!");
    }

    @Override
    public String toString(){
        return String.format("[Anfíbio] " + super.getString() + "\nTipo de pele %s", tipoPele);
    }
}
