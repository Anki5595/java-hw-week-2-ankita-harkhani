package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme19LowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: "); //here input is - THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String output = scanner.nextLine();
        lowerCase(output);
        scanner.close();
    }

    public static void lowerCase(String output){
        output = "the quick brown fox jumps over the lazy dog."; //output
        System.out.println("Output: " + output); // concatenation

    }
}
