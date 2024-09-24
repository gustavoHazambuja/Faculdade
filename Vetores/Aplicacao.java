import java.util.Scanner;

public class Aplicacao
{
    private Pessoa[] pessoas;
    private int quantidade;
    
    public Aplicacao(int tamanho){
        this.pessoas = new Pessoa[tamanho];
        this.quantidade = 0;
    }
    
    public void adicionarPessoa(String nome, int idade){
        if(quantidade < pessoas.length){
            pessoas[quantidade] = new Pessoa(nome,idade);
            quantidade++;
        }else{
            System.out.println("Erro: O vetor está cheio! ");
        }
    }
    
    public void listarPessoas(){
        for(int i = 0; i<quantidade; i++){
            System.out.println(pessoas[i].toString());
        }
    }
    
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Informe o tamanho do vetor de pessoas: ");
        int tamanho = dados.nextInt();
       
        
        Aplicacao app = new Aplicacao(tamanho);
        
        dados.nextLine();
        
        for(int i = 0; i<tamanho; i++){
            System.out.println("Informe o nome da pessoa " + (i+1) + ": ");
            nome = dados.nextLine();
            
            System.out.println("Informe a idade de " + nome + ": ");
            idade = dados.nextInt();
            
            dados.nextLine();
                
           
             app.adicionarPessoa(nome,idade);
        }
        
        
        
            System.out.println("Lista de pessoas: ");
            app.listarPessoas();
        
        
        
        
    }

    
}
