
public abstract class Figura
{
    private double posX;
    private double posY;
    private boolean visivel;
    
    public Figura(double posX, double posY){
        this.posX = posX;
        this.posY = posY;
        this.visivel = true;
    }
    
    public double getPosX(){
        return posX;
    }
    
    public double getPos(){
        return posY;
    }
    
    public boolean isVisivel(){
        return visivel;
    }
    
    public void setVisivel(boolean visivel){
        this.visivel = visivel;
    }
    
    
    public abstract double getArea();
    
    public abstract double getPerimetro();
    
    public abstract String getCor();
    
    public String toString(){
        return "Figura: " + this.getClass().getName() +
        " / " + "Àrea: " + getArea() +
        " / " + "Perímetro: " + getPerimetro() +
        " / " + "Cor: " + getCor();
    }
    
}
