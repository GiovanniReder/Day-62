package pratica.es4;

import java.util.Scanner;

public class Es4_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int numero = Integer.parseInt(scanner.nextLine()) ;
        System.out.println(numero);
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

    }

    }
/* chiedi all'utente di inserire un numero intero
con un for stampa in console il conto alla rovescia a partire da qul numero fino ad arrivare a 0


 */