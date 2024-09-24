
public class Main
{
    public static void main(String[] args){
        GerenciadorDeMembros gerenciador = new GerenciadorDeMembros();
        
        gerenciador.adicionarMembro(new Individuo("João", 27, 6750));
       
        gerenciador.adicionarMembro(new Empresa("STJ",350));
        
        gerenciador.adicionarMembro(new Individuo("Gu", 78, 15200));
        
        gerenciador.mostrarMembros();
    }
   

  
}
