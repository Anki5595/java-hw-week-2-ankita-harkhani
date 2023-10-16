package javaprogramme;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5Calculator {

    // Instance method
    public void addition(int a, int b) {
        int answer = a + b;
        System.out.println("addition: " + answer); // using concatenation
    }

    public void subtraction(int a, int b) {
        int answer = a - b;
        System.out.println("subtraction: " + answer); // Concatenation
    }

    //Static method
    public static void multiplication(int a, int b) {
        int answer = a * b;
        System.out.println("multiplication: " + answer); // Concatenation
    }

    public static void division(int a, int b) {
        int answer = a / b;
        System.out.println("division: " + answer); // Concatenation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input
        Programme5Calculator scanner1 = new Programme5Calculator(); // calling variable via object
        System.out.println("Enter First value: ");
        int a = scanner.nextInt();
        System.out.println("Enter Second value: ");
        int b = scanner.nextInt();
        scanner1.addition(a, b); // calling variables via object from Instance method to main method
        scanner1.subtraction(a, b); // calling variables via object from Instance method to main method
        multiplication(a, b); // calling variables direct from Static method to main method
        division(a, b); // calling variables direct from Static method to main method
        scanner.close(); // close the scanner
    }
}
