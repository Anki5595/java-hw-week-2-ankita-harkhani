package javaprogramme;

public class Programme2 {

    /**
     * Static variable - class
     * Scope - within the class and outside the main method
     * Memory allocation - when class is loaded
     * Store - non heap memory
     */

    static int x = 100; // x is a Static variable
    static String name = "Core Java"; // name is a static variable

    public static void m1() {
        System.out.println(x);
        System.out.println(name);
    }

    public static void main(String[] args) {
        m1(); // Static variable calling direct to static method
    }

}
