import java.util.ArrayList;


public class GerenciadorDePassagens
{
    private ArrayList<Passagem> passagens;
    
    public GerenciadorDePassagens(){
        passagens = new ArrayList<Passagem>();
    }
    
    public void adicionarPassagem(Passagem p){
        passagens.add(p);
    }
    
    public void mostrarPassagens(){
        if(passagens.isEmpty()){
            System.out.println("Nenhuma passagem registrada! ");
        }
        else{
            for(Passagem p: passagens){
            System.out.println(p);
        }
        }
        
    }
    
}
