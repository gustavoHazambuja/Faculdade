public class relatorioFinanceiro implements Agendavel {
    
    private enum STATUS{Agendada,Monitorada,Em_Execução,Concluída};
    private STATUS status;

    private String relatorioFin;

    private String horarioAgendamento;

    public relatorioFinanceiro(String relatorio){
        this.relatorioFin = relatorio;
    }
    
    public void agendar(String horario){
        this.horarioAgendamento = horario;
    }

    public void executar(){
        this.status = STATUS.Em_Execução;
        System.out.println("Fazendo a execução...");

        this.status = STATUS.Concluída;
        System.out.println("Execução concluída!");
    }

    public String monitorar(){
        return status.name();
    }
}
