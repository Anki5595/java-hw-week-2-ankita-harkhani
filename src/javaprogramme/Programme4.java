package javaprogramme;

public class Programme4 {

    int x = 20; // Instance variable
    String name = "Instance variable"; // Instance variable

    static int y = 40; // Static variable
    static String name1 = "Static variable"; // Static variable

    // Instance method
    public void m1() {
        System.out.println(x);
        System.out.println(name);
        System.out.println(y);
        System.out.println(name1);
    }

    // Static method
    public static void m2() {
        System.out.println(y);
        System.out.println(name1);
        Programme4 obj = new Programme4(); // Instance variable to static method ==> via object
        System.out.println(obj.x);
        System.out.println(obj.name);
    }

    public static void main(String[] args) {
        Programme4 t = new Programme4(); // used object to call Instance variable to Static method
        t.m1();
        m2(); // Static variable to Static method ==> direct calling
    }
}
