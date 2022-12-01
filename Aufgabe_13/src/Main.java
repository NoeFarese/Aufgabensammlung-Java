import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        System.out.println("Geben Sie die Breite des Stammes ein: ");
        Scanner scan1 = new Scanner(System.in);
        int breiteStamm = scan1.nextInt();

        System.out.println("Geben Sie die Höhe des Stammes ein: ");
        Scanner scan2 = new Scanner(System.in);
        int hoeheStamm = scan2.nextInt();

        System.out.println("Geben Sie die Höhe der Krone ein: ");
        Scanner scan3 = new Scanner(System.in);
        int hoeheKrone = scan3.nextInt();

        System.out.println("Breite des Stammes = " + breiteStamm);
        System.out.println("Höhe des Stammes = " + hoeheStamm);
        System.out.println("Höhe der Krone = " + hoeheKrone);

        zeichneKrone(hoeheKrone);
        zeichneStamm(breiteStamm, hoeheStamm, hoeheKrone);

     /*  int zeile = 0;
        int zeichen = 0;
        zeile = 1;

        while (zeile <= hoeheKrone) {
            zeichen = 0;

            while (zeichen < (hoeheKrone - zeile)) {
                System.out.print(" ");
                zeichen = zeichen + 1;
            }

            zeichen = 0;

            while (zeichen < (zeile * 2 - 1)) {
                System.out.print("*");
                zeichen = zeichen + 1;
            }

            System.out.println("");
            zeile = zeile + 1;
        }

        zeichen = 0;

        while (zeichen < (hoeheKrone - 1)) {
            System.out.print(" ");
            zeichen = zeichen + 1;
        }

        System.out.print("*"); */

    }

    static void zeichneStamm(int stammBreite, int stammHöhe, int kronenHöhe){
        for (int i = 0; i < stammHöhe; i++) {
            int leerZeichen = kronenHöhe -(int)Math.ceil((stammBreite)/2);

            zeileZeichnen(leerZeichen, stammBreite);
        }
    }

    static void zeichneKrone(int kronenHöhe){
        for (int i = 0; i < kronenHöhe; i++) {
            zeileZeichnen(kronenHöhe - i, 2 * i -1);
        }
    }

    static void zeileZeichnen(int anzahlLeerzeichen, int anzahlSterne){
        System.out.println(" ");

        for (int i = -1; i < anzahlLeerzeichen; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < anzahlSterne; i++) {
            System.out.print("*");
        }
    }
}