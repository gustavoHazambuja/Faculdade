public class Mamifero extends Animal {
    
    private String tipoPelo;
    
    public Mamifero(String nome, int idade, String Pelo){
        super(nome,idade);
        this.tipoPelo = Pelo;
    }

    public String getTipoPelo(){
        return tipoPelo;
    }

    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    public void amamentar(){
        System.out.println(getNome() + " está amamentando!");
    }

    @Override
    public String toString(){
        return String.format("[Mamífero] " + super.getString() + "\nTipo de pelo: %s", tipoPelo);
    }
}
