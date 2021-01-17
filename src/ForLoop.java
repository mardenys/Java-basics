// Umożliwia cykliczne wykonywanie ciągu instrukcji określoną liczbę razy
public class ForLoop {

    public static void main(String[] args) {

        int number = 10;
        // i specjalna zmienna sterująca
        /*for (int i = 0; i < number; i=i+2) {
            System.out.println(i);
        }*/

        //i specjalna zmienna sterująca
        /*for (int i =0; i < number;i++) {
            if(i%3==0)
                System.out.println(i);
        }*/

        for (int sth=0; sth<300; sth++) {
            System.out.println("Bede robil prace domową");
        }
    }
}
