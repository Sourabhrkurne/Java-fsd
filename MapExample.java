import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        // Accessing elements using keySet()
        System.out.println("Map Elements:");
        for (String name : ageMap.keySet()) {
            System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
        }

        // Updating the value for a specific key
        ageMap.put("Alice", 26);

        // Checking if a key exists
        String keyToCheck = "Bob";
        if (ageMap.containsKey(keyToCheck)) {
            System.out.println("\n" + keyToCheck + "'s age: " + ageMap.get(keyToCheck));
        } else {
            System.out.println("\n" + keyToCheck + " not found in the map.");
        }

        // Removing a key-value pair
        String keyToRemove = "Charlie";
        ageMap.remove(keyToRemove);

        // Displaying updated map
        System.out.println("\nMap Elements after removal:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}