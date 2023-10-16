package javaprogramme;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class Programme16TwoBinaryNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creating a scanner to read value
        System.out.println("Enter first Binary number: "); //print first statement for user
        String binary = scanner.nextLine();
        System.out.println("Enter second Binary Number: "); // print first statement for user
        String binary1 = scanner.nextLine();
        scanner.close(); //closing the scanner

        // adding two binary number
        int b1 = Integer.parseInt(binary, 2);
        int b2 = Integer.parseInt(binary1, 2);
        int sum = b1 + b2;

        System.out.println("Addition of above binary number is: ");
        System.out.println(Integer.toBinaryString(sum)); // call toBinaryString method

    }
}