import java.util.Scanner;

public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int number = scanner.nextInt();
        int i = 2;
        boolean primo = true;

        while (i <= number / 2) {
            if (number % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

    
        if (primo) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}

    

  
