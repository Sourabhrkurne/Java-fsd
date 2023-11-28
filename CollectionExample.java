
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionExample {

    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to ArrayList
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // Accessing elements using for-each loop
        System.out.println("ArrayList Elements:");
        for (String language : stringList) {
            System.out.println(language);
        }

        // HashMap example
        HashMap<Integer, String> numberMap = new HashMap<>();

        // Adding key-value pairs to HashMap
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");

        // Accessing elements using for-each loop and Map.Entry
        System.out.println("\nHashMap Elements:");
        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}