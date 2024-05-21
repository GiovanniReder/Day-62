package pratica.es3;

import java.util.Scanner;

public class Es3_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Scrivi una stringa o ':q' per uscire: ");
            String testo =scanner.nextLine();

            if (testo.equals(":q")) {
                System.out.println("Hai inserito la stringa :q, fine del ciclo while");
                break;
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < testo.length(); i++) {
                result.append(testo.charAt(i));
                if (i < testo.length()) {
                    result.append(", ");
                }
            }


            System.out.println( result);
        }

        scanner.close();
    }
}







/* Chiede in ingresso una stringa
* la stringa viene suddivisa in caratteri singoli separati da una virgola
* il while va avanti fino a che l'utente non inserisce :q nella stringa
* */
