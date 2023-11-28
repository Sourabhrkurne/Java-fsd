public class TypeCastExample {
    public static void main(String[] args) {
        // Implicit type casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // int to double

        System.out.println("Implicit type casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        // Explicit type casting (Narrowing)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // double to int

        System.out.println("\nExplicit type casting (Narrowing):");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value: " + anotherIntValue);
    }
}