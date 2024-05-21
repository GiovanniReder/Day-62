package pratica.es1;
import java.util.Scanner;
public class Es1_PariDispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi la stringa");
        String stringa=scanner.nextLine() ;
        if(stringa.length()%2==0) System.out.println(true);
        else System.out.println(false);
        scanner.close();
    }
}
