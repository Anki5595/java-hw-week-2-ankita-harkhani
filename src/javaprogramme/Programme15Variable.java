package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Programme15Variable {

    // here, two variable are a and b
    public static void variable(int a, int b) {
        System.out.println("Before swapping: " + "a" + " = " + a + " and " + "b" + " = " + b); //Concatenation
        System.out.println("After swapping: " + "a" + " = " + b + " and " + "b" + " = " + a); //Concatenation
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner to read a value
        System.out.println("Enter value for variable a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value for variable b: ");
        int b = scanner.nextInt();
        variable(a, b);
        scanner.close(); // scanner closer
    }
}
