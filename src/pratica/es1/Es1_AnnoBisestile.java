package pratica.es1;
import java.util.Scanner;

public class Es1_AnnoBisestile  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un anno");
        int anno=Integer.parseInt(scanner.nextLine());
        if(anno%4==0 && anno%100==0 && anno%400==0) System.out.println(true);
        else System.out.println(false);
        scanner.close();
    }
}
