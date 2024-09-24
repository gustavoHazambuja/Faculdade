
public class Moto extends Veiculo
{
    private double cilindradaDoMotor;
    
    public Moto(int ano, double cilindrada){
        super(ano);
        this.cilindradaDoMotor = cilindrada;
    }
    
    @Override
    public String toString(){
        return "[Moto] " + super.toString() + " /" + " Cilindrada do motor: " + cilindradaDoMotor;
    }

    
}
