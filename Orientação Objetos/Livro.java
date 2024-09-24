

public class Livro
{
     private String titulo, autor;
     private int anoPublicacao;
     private boolean disponivel;
     
     public Livro(String titulo, String autor, int anoPublicacao){
       this.titulo = titulo;
       this.autor = autor;
       this.anoPublicacao = anoPublicacao;
       this.disponivel = true;
       
     }
     public String getTitulo(){
         return titulo;
     }
     public void setTitulo(String titulo){
         this.titulo = titulo;
     }
      public String getAutor(){
         return autor;
     }
     public void setAutor(String autor){
         this.autor = autor;
     }
     public int anoPublicacao(){
         return anoPublicacao;
     }
     public void setAnoPublicacao(int anoPublicacao){
         this.anoPublicacao = anoPublicacao;
     }
     public boolean getDisponivel(){
         return disponivel;
     }
     public void setDisponivel(boolean disponivel){
         this.disponivel = disponivel;
     }
     
}
    
   

