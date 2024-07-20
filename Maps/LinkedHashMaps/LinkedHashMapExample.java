package Maps.LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Create and initialize a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        initializeMap(map);

        // Access a value
        accessValue(map);

        // Check if a key or value exists
        checkKeyValue(map);

        // Iterate through the LinkedHashMap
        iterateMap(map);

        // Demonstrate additional LinkedHashMap operations
        additionalOperations(map);

        // Remove an entry
        removeEntry(map);

        // Check the size of the LinkedHashMap
        checkSize(map);

        // Clear the LinkedHashMap
        clearMap(map);
    }

    private static void initializeMap(LinkedHashMap<String, Integer> map) {
        // Add key-value pairs to the LinkedHashMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        System.out.println("Initialized LinkedHashMap: " + map);
    }

    private static void accessValue(LinkedHashMap<String, Integer> map) {
        // Access a value
        int apples = map.get("Apple");
        System.out.println("Apples: " + apples); // Outputs: Apples: 3
    }

    private static void checkKeyValue(LinkedHashMap<String, Integer> map) {
        // Check if a key or value exists
        boolean hasBananas = map.containsKey("Banana");
        boolean hasGrapes = map.containsValue("Grapes");
        System.out.println("Has Bananas: " + hasBananas); // Outputs: Has Bananas: true
        System.out.println("Has Grapes: " + hasGrapes); // Outputs: Has Grapes: false
    }

    private static void iterateMap(LinkedHashMap<String, Integer> map) {
        // Iterate through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    private static void removeEntry(LinkedHashMap<String, Integer> map) {
        // Remove an entry
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);
    }

    private static void checkSize(LinkedHashMap<String, Integer> map) {
        // Check the size of the LinkedHashMap
        int size = map.size();
        System.out.println("Size: " + size); // Outputs: Size: 3
    }

    private static void clearMap(LinkedHashMap<String, Integer> map) {
        // Clear the LinkedHashMap
        map.clear();
        System.out.println("Size after clearing: " + map.size()); // Outputs: Size after clearing: 0
    }

    private static void additionalOperations(LinkedHashMap<String, Integer> map) {
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
