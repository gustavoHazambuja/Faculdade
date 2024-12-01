package exercicio_lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CadastroJogadores {
    private List<Jogador> listaJogadores;

    public CadastroJogadores() {
        listaJogadores = new ArrayList<>();

        Random random = new Random();

        String[] posicoes = {"Goleiro", "Zagueiro", "Meio-campo", "Atacante"};
        for (int i = 0; i < 50; i++) {
            int id = random.nextInt(9000) + 1000;
            String nome = "Jogador" + i;
            String posicao = posicoes[random.nextInt(posicoes.length)];
            int idade = random.nextInt(18) + 18; // Entre 18 e 35 anos
            double salario = 5000 + random.nextDouble() * 15000;
            int golsMarcados = random.nextInt(50);
            int jogosDisputados = random.nextInt(100);
            Jogador jogador = new Jogador(id, nome, posicao, idade, salario, golsMarcados, jogosDisputados);
            listaJogadores.add(jogador);
        }
    }

    public List<Jogador> getJogadores() {
        return Collections.unmodifiableList(listaJogadores);
    }

    @Override
    public String toString() {
        return "CadastroJogadores [listaJogadores=" + listaJogadores + "]";
    }
    
        // Outros atributos e métodos já definidos...
    
        // 1. Retornar uma lista com todos os jogadores com idade < 25 e mais de 10 gols
        public List<Jogador> getJogadoresJovensComMaisDe10Gols() {
             return listaJogadores.stream()
                .filter(j -> j.getIdade() < 25 && j.getGolsMarcados() > 10)
                .collect(Collectors.toList());
        }
    
        // 2. Retornar a quantidade de jogadores com mais de 100 jogos disputados
        public long getQuantidadeJogadoresMaisDe100Jogos() {
            return listaJogadores.stream()
                .filter(f -> f.getJogosDisputados() > 100)
                .mapToLong(Jogador::getJogosDisputados)
                .sum();
        }
    
        // 3. Retornar o somatório dos salários de atacantes com média de gols/jogo > 0.5
        public double getSomaSalariosAtacantesMediaGolsAlta() {
            return listaJogadores.stream()
                .filter(f -> f.getPosicao().contains("Atacante") && f.getMediaGolsPorJogo() > 0.5 )
                .mapToDouble(Jogador::getSalario)
                .sum();
        }
    
        // 4. Aplicar um aumento de 10% no salário de jogadores com mais de 20 gols marcados
        public void aplicarAumentoSalarioMais20Gols() {
            listaJogadores.stream()
                .filter(f -> f.getGolsMarcados() > 20)
                .forEach(f -> f.setSalario(f.getSalario() * 1.10));
        }
    
        // 5. Retornar uma lista de "Nome (ID)" para meio-campistas com mais de 30 jogos
        public List<String> getMeioCampistasComMaisDe30Jogos() {
            return listaJogadores.stream()
                .filter(f -> f.getPosicao().contains("Meio-campo") && f.getJogosDisputados() > 30)
                // .map(f -> "Nome: " + f.getNome() + ", Id: " + f.getId())
                .map(f -> f.getNome() + " (" + f.getId() + ")")
                .collect(Collectors.toList());
        }
    
        // 6. Retornar a média salarial de jogadores com mais de 30 anos
        public double getMediaSalarialJogadoresMaisDe30Anos() {
            return listaJogadores.stream()
                .filter(f -> f.getIdade() > 30)
                .mapToDouble(Jogador::getSalario)
                .average()
                .orElse(0.0);
        }
    
        // 7. Retornar a lista com nomes de jogadores com ID < 2000
        public List<String> getNomesJogadoresComIdMenor2000() {
            return listaJogadores.stream()
                .filter(f -> f.getId() < 2000)
                .map(f -> f.getNome() + " (" + f.getId() + ")")
                .collect(Collectors.toList());
        }
    
        // 8. Retornar a média de gols por jogo de um jogador específico pelo ID
        public double getMediaGolsPorJogoPorId(int id) {
            return listaJogadores.stream()
                .filter(f -> f.getId() == id)
                .mapToDouble(Jogador::getMediaGolsPorJogo)
                .findFirst()
                .orElse(-1.0);
                
        }
    
        // 9. Verificar se todos os goleiros possuem mais de 10 jogos disputados
        public boolean todosGoleirosMaisDe10Jogos() {
            return listaJogadores.stream()
                .filter(f -> f.getPosicao().contains("Goleiro"))
                .allMatch(f -> f.getJogosDisputados() > 10);
                
        }
    
        // 10. Retornar o jogador com o maior número de gols marcados
        public String getJogadorComMaisGols() {
            return listaJogadores.stream()
                .max(Comparator.comparing(Jogador::getGolsMarcados))
                .map(f -> "Jogador: " + f.getNome() + ", Gols: " + f.getGolsMarcados())
                .orElse("Nenhum jogador encontrado!");
        }

        public String getJogadorComMaisJogos(){
            return listaJogadores.stream()
                .max(Comparator.comparing(Jogador::getJogosDisputados))
                .map(f -> "Jogador: " + f.getNome() + ", Jogos: " + f.getJogosDisputados())
                .orElse("Nenhum jogador encontrado!"); 
        }
    }
    


