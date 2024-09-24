
public class Caminhao extends Veiculo
{
  private double capacidadeDeCarga;
  
  public Caminhao(int ano, double capacidade){
      super(ano);
      this.capacidadeDeCarga = capacidade;
  }
  
  @Override
    public String toString(){
        return "[Caminhão] " + super.toString() + " /" + " Capacidade de Carga: " +  capacidadeDeCarga;
    }
    
}
