import java.util.List;
import java.util.ArrayList;

public class Agencia_Banco
{
   private List<Conta> contas;
   
   public Agencia_Banco(){
       this.contas = new ArrayList<>();
   }
   
   public void CadastrarConta(Conta conta){
       for(Conta c : contas){
            if(c.getNumero() == (conta.getNumero())){
            System.out.println("Erro: Já existe uma conta com esse número cadastrado! ");
            return;
          }
      }
      contas.add(conta);
      System.out.println("Conta cadastrada com sucesso! ");
           
       }
       
   public Conta buscarContaPorNumero(int numero){
         for(Conta c : contas){
          if(c.getNumero() == (numero)){
              return c;
          }
      }
      System.out.println("Erro: Conta com esse número não encontrada! ");
      return null;
  }
  
  public void removerConta(int numero){
      Conta contaPararemover = null;
      for(Conta c : contas) {
            if(c.getNumero() == (numero)){
                contaPararemover = c;
                break;
            }
        }
        if(contaPararemover != null){
            contas.remove(contaPararemover);
            System.out.println("Conta excluída com sucesso! ");
        }else{
            System.out.println("Erro: Conta com este número não encontrado!");
        }
  }
  
  public void listarContas(){
      if(contas.isEmpty()){
          System.out.println("Nenhuma conta cadastrada! ");
      }else{
          for(Conta c : contas){
              System.out.println(c);
          }
      }
  }
}
       
   


