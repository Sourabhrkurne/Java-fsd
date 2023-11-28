// Class with default access modifier
class DefaultAccessModifierExample {
    int defaultVar = 10; // Default access modifier

    void display() {
        System.out.println("Default Access Modifier Example");
        System.out.println("Default Variable: " + defaultVar);
    }
}

// Class with public access modifier
public class AccessModifierExample {
    public int publicVar = 20; // Public access modifier

    public void publicMethod() {
        System.out.println("Public Access Modifier Example");
        System.out.println("Public Variable: " + publicVar);
    }

    // Main method to test access modifiers
    public static void main(String[] args) {
        // Creating objects of both classes
        DefaultAccessModifierExample defaultObj = new DefaultAccessModifierExample();
        AccessModifierExample publicObj = new AccessModifierExample();

        // Accessing default variable and method
        defaultObj.display();

        // Accessing public variable and method
        publicObj.publicMethod();
    }
}