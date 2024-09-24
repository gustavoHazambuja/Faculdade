

public class Triângulo
{
     private double lado1, lado2, lado3;
     
     
     public Triângulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
     }
     
     public double getLado1(){
         return lado1;
     }
     public void setLado1(double lado1){
         this.lado1 = lado1;
     }
     public double getLado2(){
         return lado2;
     }
     public void setLado2(double lado2){
         this.lado2 = lado2;
     }
     public double getLado3(){
         return lado3;
     }
     public void setLado3(double lado3){
         this.lado3 = lado3;
     }
     
     public double areaTriangulo(){
         double m = (lado1+lado2+lado3);
         double area = Math.sqrt(m * (m - lado1) * (m-lado2) * (m-lado3));
         return area;
    }
    public double perimetroTriangulo(){
        return lado1+lado2+lado3;
    }

    
}
