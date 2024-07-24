package Maps.TreeMaps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Create and initialize a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();
        initializeMap(map);

        // Access a value
        accessValue(map);

        // Check if key or value exists
        checkKeyValue(map);

        // Iterate through TreeMap
        iterateMap(map);

        // Demonstrate additional TreeMap operations
        additionalOperations(map);

        // Remove an entry
        removeEntry(map);

        // Check the size of the TreeMap
        checkSize(map);

        // Clear the TreeMap
        clearMap(map);
    }

    private static void initializeMap(TreeMap<String, Integer> map) {
        // Add key-value pairs to the TreeMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        System.out.println("Initialized TreeMap: " + map);
    }

    private static void accessValue(TreeMap<String, Integer> map) {
        // Access a value
        int apples = map.get("Apple");
        System.out.println("Apples: " + apples); // Outputs: Apples: 3
    }

    private static void checkKeyValue(TreeMap<String, Integer> map) {
        // Check if a key or value exists
        boolean hasBananas = map.containsKey("Banana");
        boolean hasGrapes = map.containsValue("Brapes");
        System.out.println("Has Bananas: " + hasBananas); // Outputs: Has Bananas: true
        System.out.println("Has Grapes: " + hasGrapes); // Outputs: Has Grapes: false
    }

    private static void iterateMap(TreeMap<String, Integer> map) {
        // Iterate through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    private static void removeEntry(TreeMap<String, Integer> map) {
        // Remove an entry
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);
    }

    private static void checkSize(TreeMap<String, Integer> map) {
        // Check the size of the TreeMap
        int size = map.size();
        System.out.println("Size: " + size); // Outputs: "Size: 3" ()
    }

    private static void clearMap(TreeMap<String, Integer> map) {
        // Clear the TreeMap
        map.clear();
        System.out.println("Size after clearing: " + map.size()); // Outputs: "Size after clearing: 0"
    }

    private static void additionalOperations(TreeMap<String, Integer> map) {
        // Demonstrate operations that take advantage of TreeMap's sorting
        map.putIfAbsent("Cherry", 10);
        map.replace("Banana", 6);
        map.computeIfPresent("Apple", (k, v) -> v + 1);
        map.computeIfAbsent("Peach", k -> 7);
        System.out.println("After additional operations: " + map);
    }
}
