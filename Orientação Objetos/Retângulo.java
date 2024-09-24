
public class Retângulo
{

   private double base;
   private double altura;
   
   public Retângulo(double base, double altura){
       this.altura = altura;
       this.base = base;
       
   }
   public double getAltura(){
       return altura;
   }
   public void setAltura(double altura){
       this.altura = altura;
   }
   public double getBase(){
       return base;
   }
   public void setBase(double base){
       this.base = base;
   }
   
   public double areaRetangulo(){
       double area1 = base * altura;
       return area1;
   }
   public double perimetroRetangulo(){
       return 2*base + 2*altura;
   }
   public double diagonalRetangulo(){
       double diagonal1 = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
       return diagonal1;
   }
   





}


