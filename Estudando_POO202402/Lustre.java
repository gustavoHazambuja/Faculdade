import java.util.*;

public class Lustre
{
    private List<Lampada> lampadas;
    public boolean ligado;

    public Lustre(int quantLampadas) {
        //lustre nasce desligado
        ligado = false;
      if (quantLampadas <= 1) {
            System.out.println("No mínimo 2 lâmpadas!");
      }else{
          //cria e armazena as lampadas
          this.lampadas = new ArrayList<>();
      for(int i = 0; i < quantLampadas;i++){
            lampadas.add(new Lampada());
      }
    }
    }
    
    public void ligar(){
        for(Lampada l:lampadas){
            l.ligar();
        }
        ligado = true;
    }
    
    public void desligar(){
        for(Lampada l:lampadas){
            l.desligar();
        }
        ligado = false;
    }
    
    public boolean verificarLampadasQueimada(){
        for(Lampada l:lampadas){
            if(l.getEstado() == Lampada.EstadoLampada.Queimada){
               // System.out.println("Lâmpada(s) queimada(s) no lustre! " );
                return true;
            }//else{
               // System.out.println("Nenhuma lâmpada queimada no lustre! ");
            //}
            
        }
        return false;
        
    }
    
    public int getQtdLampadasQueimadas(){
        int qtd = 0;
        for(Lampada l:lampadas){
            if(l.getEstado() == Lampada.EstadoLampada.Queimada){
                qtd++;
            }
        }
        return qtd;
    }
    
    public void posicaoLampadasQueimada(){
        int posicao = 1;
        //int indice = 0;
        for(Lampada l:lampadas){
            if(l.getEstado() == Lampada.EstadoLampada.Queimada){
                //System.out.println("Lâmpada queimada na posição: " + posicao + " com o índice " + indice);
                System.out.println("Lâmpada " + posicao + " queimada! ");
            }else{
                 // System.out.println("Lâmpada não queimada no lustre! ");
            }
            posicao++;
            //indice++;
        }
    }
    
 
}
