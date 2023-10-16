package javaprogramme;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r
 */

import java.util.Scanner;

/**
 * The formula for the area = Math PI * r * r, Where r = radius
 */

public class Programme6Circle {

    public static void main(String[] args) { // scanner is written under main method
        Scanner scanner = new Scanner(System.in); // create scanner object for input
        System.out.println("Enter radius of circle: ");
        double radius = scanner.nextDouble(); // using double keyword to check the values even its decimal
        Programme6Circle obj = new Programme6Circle(); // calling Instance method to main method via object
        obj.circle(radius);
        scanner.close();
    }

    public void circle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area); // concatenation of two variables
    }

}
