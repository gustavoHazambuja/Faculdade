

public class App
{
    public static void main(String[] args){
        Tela t = new Tela();
        
        t.adicionarFigura(new Circulo(5.5,7.9,3.2));
        
        t.adicionarFigura(new Quadrado(6.2,8.1,5));
        
        t.adicionarFigura(new Retangulo(8.5,9.1,4.2,6.7));
        
        t.adicionarFigura(new Quadrado(9.2,2.1,3.0));
        
        Circulo c = new Circulo(4.7,2.9,8.5);
        c.setVisivel(false);
        t.adicionarFigura(c);
    
    
        t.desenhar();
    }
  
   

 }
