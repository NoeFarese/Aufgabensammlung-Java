import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Erste Zahl: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        System.out.println("Operator: ");
        Scanner operator0 = new Scanner(System.in);
        String operator = operator0.nextLine();

        System.out.println("Zweite Zahl :");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        System.out.println("Ergebnis: ");

        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;

            default:
                System.out.println("error");
        }
    }
}


