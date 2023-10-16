package javaprogramme;

import java.util.Scanner;

public class Programme9UpperToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter Upper Case letter: "); // printing a statement for users to enter a value
        String input = scanner.nextLine();
        String lowercase = input.toLowerCase(); // convert input into lowercase
        System.out.println("Converted to Lower case: " + lowercase); // Concatenation
        scanner.close(); // close scanner

    }
}
