// zmiana commit message
import java.util.Scanner;

// porównują elementy równania i zwracają logiczną wartość (true/false)
public class OperatoryPorownania {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe a");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe b");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println("b > a: " + result);

        System.out.println("a > b: " + (firstNumber > secondNumber));
        System.out.println("a < b: " + (firstNumber < secondNumber));
        System.out.println("a >= b: " + (firstNumber >= secondNumber));
        System.out.println("a <= b: " + (firstNumber <= secondNumber));
        System.out.println("a == b: " + (firstNumber == secondNumber));
        System.out.println("a != b: " + (firstNumber != secondNumber));
    }
}
