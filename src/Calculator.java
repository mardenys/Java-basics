public class Calculator {



    public int add (int firstNumber, int secondNumber) {
        System.out.println("Suma tych liczb to: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public int substract (int firstNumber, int secondNumber) {
        System.out.println("Różnica tych liczb: " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }

    public int multiply (int firstNumber, int secondNumber) {
        System.out.println("Iloraz tych liczb to: " + (firstNumber*secondNumber));
        return firstNumber*secondNumber;
    }

    public int divide (int firstNumber, int secondNumber) {
        System.out.println("Iloczyn tych liczb to: " + (firstNumber/secondNumber));
        return firstNumber/secondNumber;
    }
}
