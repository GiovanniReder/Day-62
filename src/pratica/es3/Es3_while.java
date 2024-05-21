package pratica.es3;

import java.util.Scanner;

public class Es3_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;


        while (true) {
            System.out.print("Inserisci una stringa o ':q' per uscire: ");
            input = scanner.nextLine();


            if (input.equals(":q")) {
                System.out.println("Uscita dal programma.");
                break;
            }


            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                result.append(input.charAt(i));
                if (i < input.length() - 1) {
                    result.append(", ");
                }
            }


            System.out.println("Stringa suddivisa: " + result.toString());
        }

        scanner.close();
    }
}

/* Chiede in ingresso una stringa
* la stringa viene suddivisa in caratteri singoli separati da una virgola
* il while va avanti fino a che l'utente non inserisce :q nella stringa
* */
