
public class Retangulo extends Figura
{
    private double largura;
    private double comprimento;
    
    public Retangulo(double posX, double posY, double larg, double compri){
        super(posX,posY);
        this.largura = Math.max(larg,0.0);
        this.comprimento = Math.max(compri,0.0);
    }
    
    public double getLargura(){
        return largura;
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
     public double getArea(){
        return largura * comprimento;
    }
    
    public double getPerimetro(){
        return 2*(largura + comprimento);
    }
    
    public String getCor(){
        return "Amarelo";
    }
    

    
}
