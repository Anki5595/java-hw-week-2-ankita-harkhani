package javaprogramme;

public class Programme1 {

    /**
     * Scope - within the class and outside the main method
     * Memory Allocation - when object is created
     * Memory - heap
     */
    int x = 50; // a is a Instance or Global variable
    String name = "programme"; // name is an Instance or Global variable

    public void m1() {
        Programme1 variables = new Programme1();
        System.out.println(variables.x);
        System.out.println(variables.name);
    }

    public static void main(String[] args) {
        Programme1 obj = new Programme1(); // Instance variable calling via object to static method
        obj.m1();
    }

}
