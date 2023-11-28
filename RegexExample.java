import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        // Example 1: Matching a specific pattern
        String pattern1 = "Java";
        String text1 = "Java is fun with Java";

        // Creating a Pattern object
        Pattern patternObject1 = Pattern.compile(pattern1);

        // Creating a Matcher object
        Matcher matcher1 = patternObject1.matcher(text1);

        // Finding matches and displaying results
        System.out.println("Example 1 - Matching a specific pattern:");
        while (matcher1.find()) {
            System.out.println("Found at index " + matcher1.start() + ": " + matcher1.group());
        }

        // Example 2: Matching digits
        String pattern2 = "\\d+";
        String text2 = "123 Java 456 Programming 789";

        // Creating a Pattern object
        Pattern patternObject2 = Pattern.compile(pattern2);

        // Creating a Matcher object
        Matcher matcher2 = patternObject2.matcher(text2);

        // Finding matches and displaying results
        System.out.println("\nExample 2 - Matching digits:");
        while (matcher2.find()) {
            System.out.println("Found at index " + matcher2.start() + ": " + matcher2.group());
        }
    }
}