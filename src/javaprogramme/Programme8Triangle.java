package javaprogramme;

import java.util.Scanner;

public class Programme8Triangle {

    // The formula for Area of Triangle = 0.5 × b × h; where b= base and h= height

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner in main method
        System.out.println("Enter the base of Triangle: ");
        double base = scanner.nextDouble(); // used double keyword to enter a values including decimal values
        System.out.println("Enter height of Triangle: ");
        double height = scanner.nextDouble();
        m1(base, height); // calling static method to main method directly
        scanner.close(); // Close the scanner

    }

    public static void m1(double base, double height) {
        double area = 0.5 * base * height; // formula to calculate area of triangle
        System.out.println("The Area of Triangle: " + area); // Concatenation
    }
}
