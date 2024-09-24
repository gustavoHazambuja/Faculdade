

public class Circulo extends Figura
{
    private double raio;
    
    public Circulo(double posX, double posY, double raio){
        super(posX,posY);
        this.raio = Math.max(raio,0.0);
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(raio,2);
    }
    
    public double getPerimetro(){
        return (2 * Math.PI) * raio;
    }
    
    public String getCor(){
        return "Cinza";
    }
}
