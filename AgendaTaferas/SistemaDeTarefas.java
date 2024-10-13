import java.util.ArrayList;

public class SistemaDeTarefas {
    private ArrayList<Agendavel> tarefas;

    public SistemaDeTarefas(){
        this.tarefas = new ArrayList<Agendavel>();
    }

    public void adicionarTarefa(Agendavel tarefa){
        tarefas.add(tarefa);
    }

    public void agendarTodas(String horario){
        for(Agendavel t: tarefas){
            t.agendar(horario);
        }
    }

    public void executarTodas(){
        for(Agendavel t: tarefas){
            t.executar();
        }
    }

    public void monitorarTarefas(){
        for(Agendavel t: tarefas){
            System.out.printf("A tarefa %s está %s\n",
             t, t.monitorar());
        }
    }
}
