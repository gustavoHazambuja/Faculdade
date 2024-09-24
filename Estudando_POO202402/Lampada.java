public class Lampada{
    
    public static enum EstadoLampada {Desligada,Ligada,Queimada};
    
    private EstadoLampada estado;
    
    public Lampada(){
        this.estado = EstadoLampada.Desligada;
    }
    
    public void ligar(){
        if(this.estado == EstadoLampada.Queimada){
            return;
        }else if(this.estado == EstadoLampada.Ligada){
            return;
        }
        
        double chance = Math.random();
        
        if(chance < 0.3){
            this.estado = EstadoLampada.Queimada;
        }else{
            this.estado = EstadoLampada.Ligada;
        }
        
    }
    
    public void desligar(){
        if(this.estado == EstadoLampada.Queimada){
            return;
        } else{
            this.estado = EstadoLampada.Desligada;
        }
    }
    
    /*public boolean isQueimada(){
        return this.estado == EstadoLampada.Queimada;
    }*/    
    public EstadoLampada getEstado(){
        return estado;
    }
}
    
    