import java.util.ArrayList;


public class GerenciadorDeMembros
{
    private ArrayList<Membro> membros;
    
    public GerenciadorDeMembros(){
        this.membros = new ArrayList<Membro>();
    }
    
    public void adicionarMembro(Membro m){
        membros.add(m);
    }
    
    public void mostrarMembros(){
        if(membros.isEmpty()){
            System.out.println("Nenhum membro cadastrado! ");
        }
        else{
            for(Membro m: membros){
                System.out.println(m);
            }
        }
    }
   

    
}
