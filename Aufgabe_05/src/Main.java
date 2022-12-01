import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Wieviele Tage hat der Monat, für den Sie die Sekundenzahl berechnen wollen? ");

        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();

        if (numberMonth == 28 || numberMonth == 29 || numberMonth == 30 || numberMonth == 31 ) {
            System.out.println(numberMonth * 86400);
        }

        else {
            System.out.println("Wählen sie eine valide Zahl.");
        }
    }
}
