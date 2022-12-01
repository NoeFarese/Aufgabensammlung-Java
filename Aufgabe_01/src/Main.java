import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Geben Sie zwei Zahlen ein welche sie miteinander addieren möchten: ");

        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println(firstNumber + secondNumber);


    }
}