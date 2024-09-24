import java.util.ArrayList;

public class Tela
{
    private ArrayList<Figura> figuras;
    
    public Tela(){
        this.figuras = new ArrayList<Figura>();
    }
    
    public void adicionarFigura(Figura fig){
        figuras.add(fig);
    }
    
    public void desenhar(){
      double areaTotal = 0.0;
      double mediaArea = 0.0;
      double perimetroTotal = 0.0;
      double mediaPerimetro = 0.0;
      int qtdVisiveis = 0;
      
      for(Figura f: figuras){
          if(f.isVisivel()){
              qtdVisiveis++;
              areaTotal += f.getArea();
              perimetroTotal += f.getPerimetro();
              System.out.println(f);
          }
      }
      
      if(qtdVisiveis > 0 ){
          mediaArea = areaTotal / qtdVisiveis;
          mediaPerimetro = perimetroTotal / qtdVisiveis;
          
          System.out.println("Estatísticas das figuras: " );
          System.out.println("Área total: " + areaTotal);
          System.out.println("Área média: " + mediaArea);
          System.out.println("*******************************");
          System.out.println("Perímetro total: " + perimetroTotal);
          System.out.println("Perímetro médio: " + mediaPerimetro);
      }
    } 
}
