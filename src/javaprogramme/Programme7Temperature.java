package javaprogramme;

import java.util.Scanner;

/**
 * the formula to calculate celsius = (fahrenheit - 32) * 5 / 9
 */

public class Programme7Temperature {

    public static void main(String[] args) { // scanner always create under main method
        Scanner scanner = new Scanner(System.in); // create a scanner to read object
        System.out.println("Enter temperature in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        Programme7Temperature obj = new Programme7Temperature(); // calling Instance method to main method via object
        obj.temperature(Fahrenheit);
        scanner.close(); // close the scanner

    }

    public void temperature(double Fahrenheit) {
        double celsius = (Fahrenheit - 32) * 5 / 9; // formula to calculate celsius from fahrenheit
        System.out.println("Temperature in Celsius: " + celsius + "°C");

    }
}
