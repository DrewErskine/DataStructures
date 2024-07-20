package Maps.HashMaps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

    public static void main(String[] args) {
        // Create and initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        initializeMap(map);

        // Access a value
        accessValue(map);

        // Check if a key or value exists
        checkKeyValue(map);

        // Iterate through the HashMap
        iterateMap(map);

        // Demonstrate additional HashMap operations
        additionalOperations(map);

        // Remove an entry
        removeEntry(map);

        // Check the size of the HashMap
        checkSize(map);

        // Clear the HashMap
        clearMap(map);
    }

    private static void initializeMap(HashMap<String, Integer> map) {
        // Add key-value pairs to the HashMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        System.out.println("Initialized HashMap: " + map);
    }

    private static void accessValue(HashMap<String, Integer> map) {
        // Access a value
        int apples = map.get("Apple");
        System.out.println("Apples: " + apples); // Outputs: Apples: 3
    }

    private static void checkKeyValue(HashMap<String, Integer> map) {
        // Check if a key or value exists
        boolean hasBananas = map.containsKey("Banana");
        boolean hasGrapes = map.containsValue("Grapes");
        System.out.println("Has Bananas: " + hasBananas); // Outputs: Has Bananas: true
        System.out.println("Has Grapes: " + hasGrapes); // Outputs: Has Grapes: false
    }

    private static void iterateMap(HashMap<String, Integer> map) {
        // Iterate through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    private static void removeEntry(HashMap<String, Integer> map) {
        // Remove an entry
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);
    }

    private static void checkSize(HashMap<String, Integer> map) {
        // Check the size of the HashMap
        int size = map.size();
        System.out.println("Size: " + size); // Outputs: Size: 3
    }

    private static void clearMap(HashMap<String, Integer> map) {
        // Clear the HashMap
        map.clear();
        System.out.println("Size after clearing: " + map.size()); // Outputs: Size after clearing: 0
    }

    private static void additionalOperations(HashMap<String, Integer> map) {
        // Demonstrate putIfAbsent
        map.putIfAbsent("Banana", 10);
        map.putIfAbsent("Grapes", 10);
        System.out.println("After putIfAbsent: " + map);

        // Demonstrate computeIfPresent
        map.computeIfPresent("Apple", (k, v) -> v + 1);
        map.computeIfPresent("Grapes", (k, v) -> v + 1);
        System.out.println("After computeIfPresent: " + map);

        // Demonstrate computeIfAbsent
        map.computeIfAbsent("Peach", k -> 7);
        System.out.println("After computeIfAbsent: " + map);
    }
}