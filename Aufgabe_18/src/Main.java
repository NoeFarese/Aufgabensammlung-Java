import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Gib einen Satz ein: ");
        String eingabe = scanner1.nextLine();

        int counter= 0;

        for (int i = 0; i < eingabe.length(); i++) {
            if (Character.isLetter(eingabe.charAt(i))) {
                if (counter < 4) {
                    System.out.print(eingabe.charAt(i));
                    counter++;
                }
            } else {
                System.out.print(eingabe.charAt(i));
                counter = 0;
            }
        }
    }

}
