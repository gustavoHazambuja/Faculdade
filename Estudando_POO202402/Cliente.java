
public class Cliente
{
    private double valorCompra;
    
    public Cliente(double valorCompra){
        if(valorCompra >= 10 && valorCompra <= 5000){
             this.valorCompra = valorCompra;
        }else{
            System.out.println("O valor mínimo é R$ 10 e o valor máximo é R$ 5000! ");
        }
       
    }
    
    public double getValorCompra(){
        return valorCompra;
    }
    
    
    
    
    

    
}
