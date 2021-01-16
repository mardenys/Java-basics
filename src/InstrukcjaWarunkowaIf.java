public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 1.0F;
        float dzielnik = 3.0F;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna / dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę");
        }
    }
}
