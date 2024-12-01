import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Zoologico zoo = new Zoologico();

        // Mamíferos
        Mamifero leao = new Mamifero("Leão", 10, "Pelagem de guarda");
        zoo.adicionarAnimal(leao);
        leao.amamentar();
        zoo.adicionarAnimal(new Mamifero("Elefante", 25, "Pele espessa"));
        zoo.adicionarAnimal(new Mamifero("Tigre", 8, "Pelagem listrada"));
        zoo.adicionarAnimal(new Mamifero("Gorila", 15, "Pelagem densa"));
        zoo.adicionarAnimal(new Mamifero("Rinoceronte", 12, "Pele grossa"));

        // Répteis
        zoo.adicionarAnimal(new Reptil("Jiboia", 4, "Não possui"));
        zoo.adicionarAnimal(new Reptil("Cobra-Coral", 2, "Escamas brilhantes"));
        zoo.adicionarAnimal(new Reptil("Jacaré", 7, "Escamas duras"));
        zoo.adicionarAnimal(new Reptil("Lagarto", 3, "Escamas finas"));
        zoo.adicionarAnimal(new Reptil("Tartaruga", 100, "Carapaça rígida"));

        // Aves
        zoo.adicionarAnimal(new Ave("Papagaio", 5, 0.5));
        zoo.adicionarAnimal(new Ave("Águia", 6, 6.0));
        zoo.adicionarAnimal(new Ave("Flamingo", 4, 3.5));
        zoo.adicionarAnimal(new Ave("Coruja", 3, 1.2));
        zoo.adicionarAnimal(new Ave("Pinguim", 8, 4.5));

        // Anfíbios
        zoo.adicionarAnimal(new Anfibio("Sapo", 2, "Pântano"));
        zoo.adicionarAnimal(new Anfibio("Salamandra", 1, "Floresta"));
        zoo.adicionarAnimal(new Anfibio("Perereca", 3, "Lagoa"));
        zoo.adicionarAnimal(new Anfibio("Tritão", 2, "Riacho"));
        zoo.adicionarAnimal(new Anfibio("Rã", 1, "Charco"));

        // Peixes
        zoo.adicionarAnimal(new Peixe("Salmão", 3, "Nadadeira caudal"));
        zoo.adicionarAnimal(new Peixe("Tubarão-Martelo", 12, "Nadadeira dorsal"));
        zoo.adicionarAnimal(new Peixe("Dourado", 4, "Nadadeira anal"));
        zoo.adicionarAnimal(new Peixe("Atum", 6, "Nadadeira peitoral"));
        zoo.adicionarAnimal(new Peixe("Peixe-Espada", 5, "Nadadeira longa"));

       
         System.out.println("Informe o animal que deseja buscar:");
         String stringDeBusca = in.nextLine();
         zoo.buscarAnimalPorNome(stringDeBusca);

        in.close();

       

        //  zoo.listarAnimais();
        // System.out.println(zoo.getAnimais());
    }
}
