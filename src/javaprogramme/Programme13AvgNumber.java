package javaprogramme;
/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13AvgNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // declared scanner to read the object
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble(); // read 'a' as with double keyword
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble(); // read 'b' as with double keyword
        System.out.println("Enter third number: ");
        double c = scanner.nextDouble(); // read 'c' as with double keyword
        avgNumber(a, b, c); // calling static method to main method directly
        scanner.close(); // close scanner
    }

    public static void avgNumber(double a, double b, double c) {
        double answer = (a + b + c) / 3;
        System.out.println("Average value: " + answer);
    }
}
