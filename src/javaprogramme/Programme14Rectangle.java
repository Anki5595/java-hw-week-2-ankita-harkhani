package javaprogramme;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.6 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14Rectangle {
    public static void area(float width, float height) {
        width = 5.6f;
        height = 8.5f;
        float answer = width * height; // Formula for area is width multiply by height
        System.out.println("Area is " + width + " * " + height + " = " + answer); // concatenation
    }

    public void perimeter(double width, double height) {
        width = 5.6;
        height = 8.5;
        double answer = 2 * (width + height); // formula to calculate perimeter is 2 ( width + height)
        System.out.println("Perimeter is " + 2 + " * " + "(" + width + " + " + height + ")" + " = " + answer); // concatenation
    }

    public static void main(String[] args) {
        area(5.6f, 8.5f); // calling static method to main method direct
        Programme14Rectangle obj = new Programme14Rectangle(); // calling Instance method to main method via object
        obj.perimeter(5.6, 8.5);
    }

}
