package pratica.es3;

import java.util.Scanner;

public class Es3_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una stringa");

        String stringa = scanner.nextLine();
        String[] words = stringa.split("");
        String addVirgola = String.join(",", words);


        while (stringa.contains(":q"))
            System.out.println(addVirgola);

        scanner.close();
    }
}

/* Chiede in ingresso una stringa
* la stringa viene suddivisa in caratteri singoli separati da una virgola
* il while va avanti fino a che l'utente non inserisce :q nella stringa
* */
