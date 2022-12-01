import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Geben Sie einen Satz ein welchen Sie umgekehrt ausgeben möchten: ");

        Scanner scanner1 = new Scanner(System.in);
        String eingabe = scanner1.nextLine();

        for(int i = eingabe.length()-1; i>= 0; i--){
            System.out.print(eingabe.charAt(i));
        }

    }
}