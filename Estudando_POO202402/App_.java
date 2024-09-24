import java.time.LocalDate;

public class App_
{
    public static void main (String[] args){
        
        System.out.println("********PRODUTO************");
        
        Produto p1 = new Produto("Banana", 12.99);
    
        System.out.println(p1.getNome() + " custa " + p1.getPreco());
        
        System.out.println("********PRODUTO PERECÍVEL************");
        
        ProdutoPerecivel pp1 = new ProdutoPerecivel("Leite", 8.99,LocalDate.now());
        
        System.out.println(pp1.getNome() + " custa " + pp1.getPreco() + " e sua data de validade é " + pp1.getValidade());
        
        System.out.println("**********CARRINHO DE COMPRAS**************");
        // Declarando o carrinho de compras
        Produto[] carrinho = new Produto[4];
        
        // Adicioado produtos no carrinho
        carrinho[0] = p1;
        carrinho[1] = pp1;
        carrinho[2] = new Produto("Arroz", 21.99);
        carrinho[3] = new ProdutoPerecivel("Feijão", 17.99, LocalDate.now()); 
        
        
        for(int i = 0; i < carrinho.length; i++){
            System.out.println("Produto no carrinho: " + carrinho[i].getNome() + " R$ " + carrinho[i].getPreco());
            
            // Verificar se o produto é perecível
            if(carrinho[i] instanceof ProdutoPerecivel){
                ProdutoPerecivel perecivel = (ProdutoPerecivel) carrinho[i];
                System.out.println("Esse é um produto perecível e sua validade é: " + perecivel.getValidade());
            }
        }
       

        
    }
    
   

    
}
