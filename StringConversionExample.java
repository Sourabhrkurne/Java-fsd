public class StringConversionExample {

    public static void main(String[] args) {
        // Creating a string
        String originalString = "Hello, World!";

        // Converting string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Converting string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Displaying the original string
        System.out.println("Original String: " + originalString);

        // Displaying the converted StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Displaying the converted StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);
    }
}