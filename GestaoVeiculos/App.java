public class App {
    public static void main(String[] args) {
        Gerenciamento gerenciador = new Gerenciamento();


        gerenciador.adicionarVeiculo(new Carro("Kwid", "AB12BT4", 2002, 50.000));

        gerenciador.adicionarVeiculo(new Caminhao("DAF", "AE54BI23",2015, 35.000, 6.5));

        gerenciador.adicionarVeiculo(new Motocicleta("Honda", "NI24S32C", 2022, 15.000 ));

        gerenciador.removerVeiculo(new Caminhao("DAF", "AE54BI23",2015, 35.000, 6.5));

        Carro c1 = new Carro("Poshe", "CR27HE1", 2023, 1000000);
        gerenciador.adicionarVeiculo(c1);

        Caminhao cam1 = new Caminhao("uhuhu", "FB35TBU78", 2019, 0, 2);
        gerenciador.adicionarVeiculo(cam1);

        

        try{
            gerenciador.listarVeiculos();
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
        
        try {
            gerenciador.buscarVeiculoPorPlaca("NIDE24S32C");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try{
            gerenciador.buscarVeiculoPorMarca("Kwid");
        } catch(Exception e){
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try{
            gerenciador.buscarVeiculoPorAnoDeFabricacao(2022);
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

    
        try {
            gerenciador.venderVeiculo(c1);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try {
            gerenciador.alugarVeiculo(c1);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try {
            gerenciador.alugarVeiculo(cam1);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try {
            gerenciador.venderVeiculo(cam1);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
        


        gerenciador.calcularValorVenda();

        gerenciador.calcularTaxaDeUso();
        
       
        
    }
}
