public class Reptil extends Animal {
    
    private String tipoVeneno;

    public Reptil(String nome, int idade, String veneno){
        super(nome, idade);
        this.tipoVeneno = veneno;
    }

    public String getTipoVeneno(){
        return tipoVeneno;
    }


    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    public void rastejar(){
        System.out.println(getNome() + " está rastejando!");
    }

    @Override
    public String toString(){
        return String.format("[Réptil] " + super.getString() + "\nTipo de veneno: %s", tipoVeneno);
    }
}
