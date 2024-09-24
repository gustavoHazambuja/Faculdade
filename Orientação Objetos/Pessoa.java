import java.util.Scanner;
public class Pessoa 
 {  
      private int codigo;
      private String nome;

      //Criação método construtor//
      public Pessoa(int cogido, String nome){
          
          this.codigo = codigo;
          this.nome = nome;
          
      }
      //Métodos de acesso//
      public int getCodigo(){
          return codigo;
      }
      public void setCodigo(int codigo){
          this.codigo = codigo;
      }
      public String getNome(){
          return nome;
      }
      public void setNome(String nome){
          this.nome = nome;
      }
  
    
}

    

