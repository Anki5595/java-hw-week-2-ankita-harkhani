package javaprogramme;

import java.util.Scanner;

public class Programme17BinaryDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner to read a data
        System.out.println("Enter the decimal number: "); // print the message for user to enter a value
        int decimalNumber = scanner.nextInt(); // use int method to add number
        System.out.println("Binary equivalent of "+decimalNumber+" is: "); //print the message for user
        System.out.println(Integer.toBinaryString(decimalNumber)); // convert Integer into binary form
        scanner.close(); // close scanner
    }
}
