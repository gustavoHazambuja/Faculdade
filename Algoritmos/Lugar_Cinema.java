import java.util.Scanner;
public class Lugar_Cinema {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        // Array para armazenar o estado de cada cadeira (true = reservada, false = disponível)
        boolean[] cadeiras = new boolean[10];

        int opcao;
        String cad;
        int totCad = 0;

        do {
            // Exibir o estado atual das cadeiras
            System.out.print("[");
            for (int i = 0; i < cadeiras.length; i++) {
                if (cadeiras[i]) {
                    System.out.print("B" + (i + 1) + " (R)");  // Indicar que a cadeira está reservada
                } else {
                    System.out.print("B" + (i + 1));
                }
                if (i < cadeiras.length - 1) {
                    System.out.print("][");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
            System.out.println("-----------------------------------------");

            System.out.println("Reservar cadeira: ");
            cad = dados.nextLine().toUpperCase();

            // Converter a entrada para um índice do array
            if (cad.startsWith("B")) {
                try {
                    int numeroCadeira = Integer.parseInt(cad.substring(1));
                    if (numeroCadeira >= 1 && numeroCadeira <= 10) {
                        if (!cadeiras[numeroCadeira - 1]) {
                            cadeiras[numeroCadeira - 1] = true;
                            System.out.println("Cadeira " + cad + " Reservada!");
                            totCad++;
                        } else {
                            System.out.println("Cadeira " + cad + " já está reservada!");
                        }
                    } else {
                        System.out.println("Cadeira " + cad + " não existe!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Formato de cadeira inválido!");
                }
            } else {
                System.out.println("Formato de cadeira inválido!");
            }

            System.out.println("Quer reservar outro? (1) Sim (2) Não ");
            opcao = dados.nextInt();
            dados.nextLine(); // Consumir a nova linha residual

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 2);

       System.out.println("Total de cadeiras que você reservou: " + totCad);
    }
}
