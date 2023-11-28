
public class ConstructorExample {

    // Default constructor
    public ConstructorExample() {
        System.out.println("Default Constructor called");
    }

    // Parameterized constructor
    public ConstructorExample(int value) {
        System.out.println("Parameterized Constructor called with value: " + value);
    }

    // Copy constructor
    public ConstructorExample(ConstructorExample other) {
        System.out.println("Copy Constructor called with value from another object: " + other);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorExample defaultConstructorObj = new ConstructorExample();
        ConstructorExample parameterizedConstructorObj = new ConstructorExample(42);

        // Creating an object and using the copy constructor
        ConstructorExample originalObj = new ConstructorExample(100);
        ConstructorExample copyConstructorObj = new ConstructorExample(originalObj);
    }
}