import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args){
    
    GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();
        
    pessoaFisica pf1 = new pessoaFisica("Gustavo Henrique",2006, "123456789");
        
    pessoaJuridica pj1 = new pessoaJuridica("PUCRS", 1970, "95739548973");
        
    ArrayList<Pessoa> pessoas = new ArrayList();
    
    pessoas.add(pf1);
    pessoas.add(pj1);
    
    gerenciador.adicionarPessoa(new pessoaFisica("Gustavo Henrique",2006, "123456789"));
    
    gerenciador.adicionarPessoa(new pessoaJuridica("PUCRS", 1970, "95739548973"));
    
    // Mostrar todo mundo
    
    gerenciador.mostrarPessoas();
    
    // Buscando informação
    String stringDeBusca = "973";
    System.out.printf("Buscando por %s...\n", stringDeBusca);
    boolean achouPeloMenosUm = false;
    for(Pessoa p: pessoas){
        if(p.toString().contains(stringDeBusca)){
            achouPeloMenosUm = true;
            System.out.println(p);
        }
    }
    
    if(!achouPeloMenosUm){
        System.out.println("Nenhum registro encontrado! ");
    }
  }  
}
