public class Circulo {
    private double raio;
    private double posX;
    private double posY;

    public Circulo(double x, double y, double raio) {
        setX(x);
        setY(y);
        this.raio = (raio >= 0.0) ? raio : 0.0;

    }

    public double getRaio() {
        return raio;
    }

    public double getX() {
        return posX;
    }

    public double getY() {
        return posY;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2.0 * Math.PI * raio;
    }

    public void setX(double x) {
        this.posX = (x > 0.0) ? x : posX;
    }

    public void setY(double y) {
        this.posY = (y > 0.0) ? y : posY;
    }

    public void moverPara(double x, double y) {
        if (x >= 0.0 && y >= 0.0) {
            this.posX = x;
            this.posY = y;
        }

    }

    public void mover(double deltaX, double deltaY) {
        if (this.posX + deltaX >= 0.0 && this.posY + deltaY >= 0.0) {
            this.posX += deltaX;
            this.posY += deltaY;
        }
    }

}