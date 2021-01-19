import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator liczenie = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakie działanie ma być wykonane? 1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie");
        int mathOperation = scanner.nextInt();

        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        if(mathOperation == 1) {
            int addition = liczenie.add(firstNumber,secondNumber);
        }
        else if(mathOperation == 2) {
            int substraction = liczenie.substract(firstNumber,secondNumber);
        }
        else if (mathOperation == 3) {
            int multiplication = liczenie.multiply(firstNumber, secondNumber);
        }
        else if (mathOperation == 4) {
            int division = liczenie.divide(firstNumber, secondNumber);
        }
        else {
            System.out.println("Nia ma takiego działania");
        }



        /*Scanner scanner = new Scanner(System.in);

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
        System.out.println("Wynik modulus: " + modulus);*/

    }
}
