import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if(age < 18 && age >= 0) {
            System.out.println("Poczekaj od 18 urodzin");
        } else if (age < 0) {
            System.out.println("Wprowadź wartość więszką od zera");
        } else

        {
            System.out.println("Dziękuję za zakupy");
        }
    }
}
