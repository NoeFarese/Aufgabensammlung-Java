import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vokal = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int ä = 0;
        int ö = 0;
        int ü = 0;

        System.out.println("Geben Sie einen Satz ein:");
        String satz = new Scanner(System.in).nextLine().toLowerCase();
        satz = satz.toLowerCase();


        for (int j = 0; j < satz.length(); j++) {
            switch (satz.charAt(j)) {

                case 'a':
                    ++a;
                    ++vokal;
                    break;
                case 'e':
                    ++e;
                    ++vokal;
                    break;
                case 'i':
                    ++i;
                    ++vokal;
                    break;
                case 'o':
                    ++o;
                    ++vokal;
                    break;
                case 'u':
                    ++u;
                    ++vokal;
                    break;
                case 'ä':
                    ++ä;
                    ++vokal;
                    break;
                case 'ö':
                    ++ö;
                    ++vokal;
                    break;
                case 'ü':
                    ++ü;
                    ++vokal;
                    break;
            }

        }
        System.out.println("Anzahl der Vokale: " + vokal);
        System.out.println("Anzahl Vokal A: " + a);
        System.out.println("Anzahl Vokal E: " + e);
        System.out.println("Anzahl Vokal I: " + i);
        System.out.println("Anzahl Vokal O: " + o);
        System.out.println("Anzahl Vokal U: " + u);
        System.out.println("Anzahl Vokal Ö: " + ö);
        System.out.println("Anzahl Vokal Ü: " + ü);
        System.out.println("Anzahl Vokal Ä: " + ä);
    }
}

