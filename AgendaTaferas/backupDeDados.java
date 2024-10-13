public class backupDeDados implements Agendavel{
    
    private enum STATUS{Agendada,Monitorada,Em_Execução,Concluída};
    private STATUS status;


    private String horarioAgendamento;


    public backupDeDados(String horario){
        this.status = STATUS.Agendada;

    }


    public void agendar(String horario){
        this.horarioAgendamento = horario;
        this.status = STATUS.Agendada;
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
