import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division = firstNumber/secondNumber;
        int modulus = firstNumber%secondNumber;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + substraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulus: " + modulus);

    }
}
