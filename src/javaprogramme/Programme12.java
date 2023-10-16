package javaprogramme;

/**
 * Write a Java program to compute the specified expressions and print the output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */

public class Programme12 {

    public static void division() {
        double a = 25.5 * 3.5 - 3.5 * 3.5;
        double b = 40.5 - 4.5;
        double answer = a / b;
        System.out.println("Expected Output: " + answer);

    }
    public static void main(String[] args) {
        division();
    }
}
