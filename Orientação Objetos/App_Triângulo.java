
public class App_Triângulo
{
   public static void main(String[] args){
       Triângulo t1 = new Triângulo(5,5,5);
       
       Triângulo t2 = new Triângulo(5,5,8);
       
       Triângulo t3 = new Triângulo(5,6,9);
       
       System.out.println("Informações do triângulo1: ");
       System.out.println("O lado1 do triângulo é: " + t1.getLado1());
       System.out.println("O lado2 do triângulo é: " + t1.getLado2());
       System.out.println("O lado3 do triângulo é: " + t1.getLado3());
     
       System.out.println("A área do é: " + t1.areaTriangulo());
       System.out.println("O perímetro do triângulo é: " + t1.perimetroTriangulo());
       
       if(t1.getLado1() == t1.getLado2() && t1.getLado2() == t1.getLado3()){
           System.out.println("É um triângulo equilátero!");
       }else if(t1.getLado1() == t1.getLado2() || t1.getLado2() == t1.getLado3()){
           System.out.println("É um triângulo isósceles!");
       }
       else{
           System.out.println("É um triângulo escaleno!");
       }
       
       System.out.println("********************");
       System.out.println("Informações do triângulo2: ");
       System.out.println("O lado1 do triângulo é: " + t2.getLado1());
       System.out.println("O lado2 do triângulo é: " + t2.getLado2());
       System.out.println("O lado3 do triângulo é: " + t2.getLado3());
       double perimetro2 = t2.getLado1() + t2.getLado2() + t2.getLado3();
       double area2 = (t2.getLado1() + t2.getLado2() + t2.getLado3())/2;
       double area2Tri = Math.sqrt(area2*(area2 - t2.getLado1())*(area2 - t2.getLado2())*(area2 - t2.getLado3()));
       System.out.println("O perímetro do triângulo é: " + perimetro2);
       System.out.println("A área do triângulo é: " + area2Tri);
       if(t2.getLado1() == t2.getLado2() && t2.getLado2() == t2.getLado3()){
           System.out.println("É um triângulo equilátero!");
       }else if(t2.getLado1() == t2.getLado2() || t2.getLado2() == t2.getLado3()){
           System.out.println("É um triângulo isósceles!");
       }
       else{
           System.out.println("É um triângulo escaleno!");
       }
       
        System.out.println("********************");
       System.out.println("Informações do triângulo3: ");
       System.out.println("O lado1 do triângulo é: " + t3.getLado1());
       System.out.println("O lado2 do triângulo é: " + t3.getLado2());
       System.out.println("O lado3 do triângulo é: " + t3.getLado3());
       double perimetro3 = t3.getLado1() + t3.getLado2() + t3.getLado3();
       double area3 = (t3.getLado1() + t3.getLado2() + t3.getLado3())/2;
       double area3Tri = Math.sqrt(area3*(area3 - t3.getLado1())*(area3 - t3.getLado2())*(area3 - t3.getLado3()));
       System.out.println("O perímetro do triângulo é: " + perimetro3);
       System.out.println("A área do triângulo é: " + area3Tri);
       if(t3.getLado1() == t3.getLado2() && t3.getLado2() == t3.getLado3()){
           System.out.println("É um triângulo equilátero!");
       }else if(t3.getLado1() == t3.getLado2() || t3.getLado2() == t3.getLado3()){
           System.out.println("É um triângulo isósceles!");
       }
       else{
           System.out.println("É um triângulo escaleno!");
       }

   }
    
    
    
    
    
    
}
