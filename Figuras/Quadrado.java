
public class Quadrado extends Figura
{
    private double lado;
    
    public Quadrado(double posX, double posY, double lado){
        super(posX, posY);
        this.lado = Math.max(lado,0.0);
    }
    
    public double getLado(){
        return lado;
    }
    
      public double getArea(){
        return Math.pow(lado,2);
    }
    
    public double getPerimetro(){
        return 4 * lado;
    }
    
    public String getCor(){
        return "Laranja";
    }
   

}
