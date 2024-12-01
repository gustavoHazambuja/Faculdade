package exercicio_lambda2;

public class Jogador {
    private int id;
    private String nome;
    private String posicao; // Ex: Goleiro, Zagueiro, Meio-campo, Atacante
    private int idade;
    private double salario;
    private int golsMarcados;
    private int jogosDisputados;

    public Jogador(int id, String nome, String posicao, int idade, double salario, int golsMarcados, int jogosDisputados) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.salario = salario;
        this.golsMarcados = golsMarcados;
        this.jogosDisputados = jogosDisputados;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public int getJogosDisputados() {
        return jogosDisputados;
    }

    public double getMediaGolsPorJogo() {
        if (jogosDisputados == 0) {
            return 0.0;
        }
        return (double) golsMarcados / jogosDisputados;
    }

    @Override
    public String toString() {
        return "Jogador [id=" + id + ", nome=" + nome + ", posicao=" + posicao + ", idade=" + idade
                + ", salario=" + salario + ", golsMarcados=" + golsMarcados + ", jogosDisputados=" + jogosDisputados + "]";
    }
}

