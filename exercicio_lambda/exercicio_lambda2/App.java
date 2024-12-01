package exercicio_lambda2;

public class App {
    public static void main(String[] args) {
        CadastroJogadores cadastro = new CadastroJogadores();

        System.out.printf("Jogadores jovens com mais de 10 gols: %s\n", cadastro.getJogadoresJovensComMaisDe10Gols());
        System.out.printf("Jogadores com mais de 100 jogos: %d\n", cadastro.getQuantidadeJogadoresMaisDe100Jogos());
        System.out.printf("Somatório dos salários de todos os atacantes que possuem uma média de gols por jogo maior que 0.5: %.2f\n ", cadastro.getSomaSalariosAtacantesMediaGolsAlta());
        System.out.printf("Meio-campistas com mais de 30 jogos: %s\n", cadastro.getMeioCampistasComMaisDe30Jogos());
        System.out.printf("Média salarial de jogadores com mais de 30 anos: %.2f\n", cadastro.getMediaSalarialJogadoresMaisDe30Anos());
        System.out.printf("Jogadores com ID menor que 2000: %s\n", cadastro.getNomesJogadoresComIdMenor2000());
        System.out.printf("Média de gols do jogador: %.2f\n", cadastro.getMediaGolsPorJogoPorId(1900));
        
        cadastro.aplicarAumentoSalarioMais20Gols();
        System.out.println("Todos os goleiross tem mais de 10 jogos? " + cadastro.todosGoleirosMaisDe10Jogos());
        System.out.printf("Jogador com mais gols: %s\n", cadastro.getJogadorComMaisGols());
        System.out.printf("Jogador com mais jogos: %s\n", cadastro.getJogadorComMaisJogos());

    }
    


}
