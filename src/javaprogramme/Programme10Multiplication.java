package javaprogramme;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 */

import java.util.Scanner;

public class Programme10Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner declaration to read the object
        System.out.println("Enter Number: "); // print a statement for user to enter a value
        int x = scanner.nextInt(); // using integer to store a timetable values
        int number1 = x;
        int number2 = x * 2;
        int number3 = x * 3;
        int number4 = x * 4;
        int number5 = x * 5;
        int number6 = x * 6;
        int number7 = x * 7;
        int number8 = x * 8;
        int number9 = x * 9;
        int number10 = x * 10;

        System.out.println(x + " * " + 1 + " = " + number1);
        System.out.println(x + " * " + 2 + " = " + number2);
        System.out.println(x + " * " + 3 + " = " + number3);
        System.out.println(x + " * " + 4 + " = " + number4);
        System.out.println(x + " * " + 5 + " = " + number5);
        System.out.println(x + " * " + 6 + " = " + number6);
        System.out.println(x + " * " + 7 + " = " + number7);
        System.out.println(x + " * " + 8 + " = " + number8);
        System.out.println(x + " * " + 9 + " = " + number9);
        System.out.println(x + " * " + 10 + " = " + number10);
        scanner.close(); // closing a scanner


    }
}
