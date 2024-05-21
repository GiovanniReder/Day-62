package pratica.es2;

import java.util.Scanner;

public class Es2_switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int number=Integer.parseInt(scanner.nextLine());
        switch (number){
            case 0:{
                System.out.println("zero");
                break;
            }
            case 1:{
                System.out.println("uno");
                break;
            }case 2:{
                System.out.println("due");
                break;
            }case 3:{
                System.out.println("tre");
                break;
            }
            default:{
                System.out.println("Il numero non è compreso tra 0 e 3");
                break;
            }
        }
    }
}
/* chiede un numero intero in ingresso
* sei il valore del numero è compreso tra 0 e 3 lo stampa in lettere es. zero uno due tre
* nel default ci va l'errore se il numero non è compreso tra 0 e 3
* */