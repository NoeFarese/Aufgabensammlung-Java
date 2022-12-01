import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        System.out.println("Geben Sie eine Ganzzahl zwischen 1 bis 12 ein für den entsprechenden Monat: ");

        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();
        System.out.println("Zahl für den Monat: ");


        if (numberMonth > 0 && numberMonth < 13) {
            System.out.println("Monat: " + monate[numberMonth -1]);
        }

        else {
            System.out.println("Bitte wählen Sie eine Zahl zwischen 1 und 12.");
        }
    }
}