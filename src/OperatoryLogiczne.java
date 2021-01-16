public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && i
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && thirdValue); //true

        // || lub
        System.out.println(firstValue || secondValue); //true
        System.out.println(secondValue || fourthValue); //false

        //! negacja
        System.out.println(!firstValue); //false
        System.out.println(!secondValue); //true
        System.out.println(!(firstValue && secondValue)); //true
    }
}
