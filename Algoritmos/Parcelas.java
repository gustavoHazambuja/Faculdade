import java.util.Scanner;
public class Parcelas
{
    public static void main(String args[]){
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Informe o valor do empréstimo: ");
        double valor = dados.nextDouble();
        
        double juros = (valor * 20) / 100; //20%//
        System.out.println("Valor dos juros: " + juros);
        
        double totalVal = valor + juros;
        System.out.println("Valor total: " + totalVal);
        
        System.out.println("Informe a quantidade de parcelas: ");
        int parcel = dados.nextInt();
        
        double totalParcel = totalVal / parcel;
        
        System.out.println("O pagamento vai ser feito com " + parcel + " parcelas de R$" + totalParcel);
    }
}


