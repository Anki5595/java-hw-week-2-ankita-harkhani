package javaprogramme;

public class Programme3 {

    String name = "Software Testing"; // name is a Instance or Global variable
    static int a = 500; // a is a Static variable

    // Instance method
    public void m1() {
        System.out.println(name);
        System.out.println(a);
    }

    // Static method
    public static void m2() {
        System.out.println(a);
        Programme3 obj = new Programme3();
        System.out.println(obj.name);
    }

    public static void main(String[] args) {
        Programme3 t = new Programme3(); // Instance variable calling to Static method via using object
        t.m1();
        m2(); // static variable calling to static method direct
    }

}
