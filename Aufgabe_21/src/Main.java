import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        System.out.println("Geben Sie ein Geburtsdatum ein für die Berchnungen. Beispiel: 17.07.1977");
        Scanner scan1 = new Scanner(System.in);

        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        String Datum = scan1.nextLine();

        Date datum = df.parse(Datum);
        Date heute = new Date();

        long ms = heute.getTime() - datum.getTime();
        long sek = ms / 1000;
        long min = sek / 60;
        long std = min / 60;
        long tage = std / 24;
        long wochen = tage / 7;
        long monate = tage / 30;
        long jahre = tage / 365;


        System.out.println("Alter in Jahre: " + jahre);
        System.out.println("Alter in Monaten: " + monate);
        System.out.println("Alter in Wochen: " + wochen);
        System.out.println("Alter in Tagen: " + tage);
    }
}
