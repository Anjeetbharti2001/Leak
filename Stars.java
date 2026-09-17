public class Stars {

    String name = "Anjeet";

    // Instance Method
    void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String args[]) {

        Stars p = new Stars();

        p.greet(); // Calling instance method
    }
}