// Outer class
public class OuterClass {

    // Member variable in the outer class
    private String outerMessage = "Hello from OuterClass";

    // Inner class
    public class InnerClass {
        // Member variable in the inner class
        private String innerMessage = "Hello from InnerClass";

        // Method in the inner class accessing both inner and outer class members
        public void displayMessages() {
            System.out.println(innerMessage);
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerObject = new OuterClass();

        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        // Calling a method in the inner class
        innerObject.displayMessages();
    }
}