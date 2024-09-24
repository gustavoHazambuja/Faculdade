import java.util.Scanner;


public class AppProduto
{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        
        String nome;
        double preco;
        
        Produto[] listaProdutos = new Produto[5];
        
        for(int i = 0; i<5; i++){
            System.out.println("Informe o nome do produto " + (i+1) + ": ");
            nome = dados.nextLine();
            
            System.out.println("Informe o preço do(a) " + nome + ": ");
            preco = dados.nextDouble();
            
            dados.nextDouble();
            
            Produto produto1 = new Produto(nome,preco);
            listaProdutos[i] = produto1;
        }
        
        System.out.println("Lista de produtos: ");
        for(int i = 0; i<5; i++){
            System.out.println(listaProdutos[i].toString());
        }
        
       
        
    }
    
}
