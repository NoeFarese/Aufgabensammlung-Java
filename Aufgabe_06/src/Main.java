import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int i= 1;

        System.out.println("Gib bitte an wieviele Kilometer du rennen möchtest: ");

        Scanner Scanner1 = new Scanner(System.in);
        double strecke = Scanner1.nextDouble();

        if (strecke > 42) {
            System.out.println("Das schaffst du nicht!");
        } else {
            strecke *= 1000;
            strecke /= 400;
            System.out.println("Bist du bereit " + strecke + " Runden zu rennen?");

            Scanner Scanner2 = new Scanner(System.in);
            String antwort = Scanner2.nextLine();
            antwort.toLowerCase();

            if (antwort.equals("ja")) {
                if (strecke >= i) {
                    for (int j = 1; j <= strecke; i++) {
                        System.out.println("Du läufst Runde " + i);
                        j++;
                    }
                    System.out.println("Du hast es geschaft!");
                } else {
                    System.out.println("Du hast es geschaft!");
                }
            } else if (antwort.equals("nein")) {
                System.out.println("Vielleicht ein anderes Mal!");
                System.exit(0);
            } else {
                System.out.println("Bitte antworte mit ja oder nein");
            }
        }

    }
}