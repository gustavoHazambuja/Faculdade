import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        // Iterar sobre uma lista de strings e imprimir o conteúdo no console.
        list.stream()
            .forEach(System.out::println);

        // Criar uma string que consiste na concatenação das primeiras letras de cada string contida em uma lista de strings 

         String iniciais = list.stream()
            .map(s -> String.valueOf(s.charAt(0))) // Extrai a primeira letra de cada string // valueOf - Converte para String
            .collect(Collectors.joining()); // Concatena todas as letras

            System.out.println("Concatenação:" + iniciais);

        //  Transformar uma lista de strings em strings maiúsculas (ou seja, alterando a lista original)
         List<String> maiusc = list.stream()
            .map(String::toUpperCase) // Fazendo método de referência para transformar em maiúscula
            .collect(Collectors.toList()); // Devolvendo uma lista

            System.out.println("Lista em maiúscula: " + maiusc);

        // Transformar uma lista de strings em uma nova lista de strings em maiúsculas (ou seja, sem alterar a original).

        List<String> list2 = Arrays.asList("argola", "bola", "cachorro", "dado", "escada", "faca");
            List<String> maiusc2 = list2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

                
            System.out.println("Lista em maiúscula: " + maiusc2);
    
        // Contar o número de elementos de uma lista de strings que possuem pelo menos seis caracteres.
            long caracter = list.stream()
                .filter(s -> s.length() >= 6)
                .count();
            System.out.println("Quantidade de elementos com mais de 6 caracteres: " + caracter);    

            
            
    }
}