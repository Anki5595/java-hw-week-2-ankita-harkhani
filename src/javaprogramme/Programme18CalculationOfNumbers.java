package javaprogramme;

public class Programme18CalculationOfNumbers {

    // Static variables
    static int FirstNumber = 125;
    static int SecondNumber = 24;
    public static void addition(int FirstNumber, int SecondNumber){ // Calling Static variable to static method direct
        int answer = FirstNumber + SecondNumber; // Addition of first number and second number
        System.out.println(FirstNumber + " + " + SecondNumber + " = " + answer); // output in concatenation
    }

    public static void subtraction(int FirstNumber, int SecondNumber){ // Calling Static variable to static method direct
        int answer = FirstNumber - SecondNumber; // Subtraction of first number and second number
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + answer); // output in concatenation
    }

    public static void multiplication(int FirstNumber, int SecondNumber){ // Calling Static variable to static method direct
        int answer = FirstNumber * SecondNumber; // multiplication of first number and second number
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + answer); // output in concatenation
    }

    public static void division(int FirstNumber, int SecondNumber){  // Calling Static variable to static method direct
        int answer = FirstNumber / SecondNumber; // division of first number and second number
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + answer); // output in concatenation
    }

    public static void remainder(int FirstNumber, int SecondNumber){ // Calling Static variable to static method direct
        int answer = FirstNumber % SecondNumber; // reminder of first number and second number
        System.out.println(FirstNumber + " mod " + SecondNumber + " = " + answer); // output in concatenation

    }

    public static void main(String[] args) {
        addition(125, 24);
        subtraction(125,24);
        multiplication(125, 24);
        division(125, 24);
        remainder(125, 24);

    }
}
