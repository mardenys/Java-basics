public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = 12;

        if(number == 0) {
            System.out.println("Liczba równa zero");
        } else if(number > 10) {
                System.out.println("Numer większy od 10");
        } else if(number > 0) {
            System.out.println("Liczba dodatnia");
        }
        else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Żaden z warunków nie został spełniony");
        }
    }
}
