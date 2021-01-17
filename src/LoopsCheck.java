public class LoopsCheck {

    public static void main(String[] args) {

        //liczby z zakresu 1-100 podzielne przez 3
        /*for (int i =1; i < 100 ;i++) {
            if(i%3==0)
                System.out.println(i);
        }*/


        //odwrcone elementy tablicy
        int[] tableElements = new int[] {1,3,5,7,0};

        for (int i=0; i <(tableElements.length/2);i++) {
            int temp = tableElements[i]; //dla i=0 1  i=1  3
            tableElements[i] = tableElements[tableElements.length - 1 - i]; // 4=>0   3=>7
            tableElements[tableElements.length - 1 - i] = temp; //1  // numbers[3]  =3
        }

        for (int i=0; i < tableElements.length; i++) {
            System.out.println(tableElements[i]);
        }

    }

}

