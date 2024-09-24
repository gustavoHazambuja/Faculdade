import java.util.Scanner;
public class Codigo
{
    public static void main(String args[]){
        int XYPK,KLMP,QRST,ABCD, cod, quant;
        Scanner dados = new Scanner(System.in);
        System.out.println("1-XYPK, 2-KLMP, 3-QRTS, 4-ABCD");
        cod = dados.nextInt();
        System.out.println("Quantidade total do produto: ");
        quant = dados.nextInt();
        if(cod == 1){
            System.out.println("Preço total é: " + (6*quant));
        }else if(cod == 2){
            System.out.println("Preço total é: " + (3.20*quant));
        }else if(cod == 3){
             System.out.println("Preço total é: " + (2.50*quant));
        }else if (cod == 4){
            System.out.println("Preço total é: " + (5.30*quant));
        }    
        else{
             System.out.println("ERRO:Código inválido: ");
        }
    }  
} 
                           
       
                            
 

                    
                 
