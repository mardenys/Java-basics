public class LoopsCheck {

    public static void main(String[] args) {


        //odwrcone elementy tablicy
        int[] numbers = new int[] {1,3,5,7,9};

        for (int i=0; i <(numbers.length/2);i++) {
            int temp = numbers[i]; //dla i=0 1  i=1  3
            numbers[i] = numbers[numbers.length - 1 - i]; // 4=>9   3=>7
            numbers[numbers.length - 1 - i] = temp; //1  // numbers[3]  =3
        }

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}

