
public class App
{
    public static void main(String[] args){
      GerenciadorDePassagens gerenciador = new GerenciadorDePassagens();
      
      gerenciador.adicionarPassagem(new Passagem("7676986","Gu","15F",2300));
      
      gerenciador.adicionarPassagem(new Economy("357642","Lu","78B",3000));
      
      gerenciador.adicionarPassagem(new Executive("45782","Tu","35C",2550));
      
      gerenciador.adicionarPassagem(new Premier("78235","Bu","29D",4670));
      
      gerenciador.mostrarPassagens();
      
      
    }
    
    
    
        
}

