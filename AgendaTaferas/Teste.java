public class Teste {
    public static void main(String[] args) {

        SistemaDeTarefas sistemas = new SistemaDeTarefas();
        
        backupDeDados backup1 = new backupDeDados("22:50");
        limpezaDeSistema limpeza1 = new limpezaDeSistema("Limpo");
        relatorioFinanceiro relatorio1 = new relatorioFinanceiro("Dia longo");


        sistemas.adicionarTarefa(backup1);
        sistemas.adicionarTarefa(limpeza1);
        sistemas.adicionarTarefa(relatorio1);

        sistemas.agendarTodas("09:30");

        sistemas.executarTodas();

        sistemas.monitorarTarefas();
    }


}
