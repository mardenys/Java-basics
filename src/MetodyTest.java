public class MetodyTest {
    public static void main(String[] args) {
        Metody metodziki = new Metody();
        //metodziki.policzWynik();

        /*int result = metodziki.pobierzWynik();
        int result2 = result *2;
        System.out.println("Rezultat przed mnozeniem to: " + result);
        System.out.println("Rezultat po mnożeniu to: " + result2);*/

        /*metodziki.policzWynikParam(2);
        metodziki.policzWynikParam(100);
        metodziki.policzWynikParam(23);*/


        int result = metodziki.add(2,3, "hello");
        System.out.println(metodziki.add(1,6, "hello 2"));
        System.out.println(result);
    }
}
