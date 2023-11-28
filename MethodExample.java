
public class MethodExample {

    // Method with no parameters and no return value
    static void printHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and a return value
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with a parameter and no return value
    static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Calling a method with no parameters and no return value
        printHello();

        // Calling a method with parameters and a return value
        int sum = addNumbers(5, 7);
        System.out.println("Sum: " + sum);

        // Calling a method with a parameter and no return value
        printMessage("Java Methods Example");
        
        // Calling a method and using the return value
        int result = addNumbers(10, 20);
        System.out.println("Result: " + result);

        // Using the return value directly in an expression
        System.out.println("Result * 2: " + addNumbers(10, 20) * 2);
    }
}