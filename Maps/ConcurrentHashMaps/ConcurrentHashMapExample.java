package Maps.ConcurrentHashMaps;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args){

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        initializeMap(map);

        accessValue(map);

        // Check if a key or value exists
        checkKeyValue(map);

        iterateMap(map);

        additionalOperations(map);

        // Remove an entry
        removeEntry(map);

        // Clear the ConcurrentHashMap
        clearMap(map);
    } 

    private static void initializeMap(ConcurrentHashMap<String, Integer> map) {
        // Add key-value pairs to the ConcurrentHashMap
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        System.out.println("Initialized ConcurrentHashMap: " + map);
    }

    private static void accessValue(ConcurrentHashMap<String, Integer> map) {
        // Access a value
        int apples = map.get("Apple");
        System.out.println("Apples: " + apples); // Outputs: Apples: 3
    }

    private static void checkKeyValue(ConcurrentHashMap<String, Integer> map) {
        // Check if a key or value exists
        boolean hasBananas = map.containsKey("Banana");
        boolean hasGrapes = map.containsValue("Grapes");
        System.out.println("Has Bananas: " + hasBananas); // Outputs: Has Bananas: true
        System.out.println("Has Grapes: " + hasGrapes); // Outputs: Has Grapes: false
    }

    private static void iterateMap(ConcurrentHashMap<String, Integer> map){
        // Iterate through the ConcurrentHashMap
        System.out.println("Iterating throught the ConcurrentHashMap: ");
        for(Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

    private static void additionalOperations(ConcurrentHashMap<String, Integer> map){
        // Demonstrate atomic operations
        map.computeIfAbsent("Cherry", k -> 10);
        map.computeIfPresent("Apple", (k,v) -> v + 1);
        map.merge("Banana", 1, Integer::sum);
        System.out.println("After additional operations: " + map);
    }

    private static void removeEntry(ConcurrentHashMap<String, Integer> map){
        // Remove an entry
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);
    }

    private static void checkSize(ConcurrentHashMap<String, Integer> map){
        int size = map.size();
        System.out.println("Size: " + size); //Outputs: Size: 3
    }

    private static void clearMap(ConcurrentHashMap<String, Integer> map){
        // Clear the ConccurentHashMap
        map.clear();
        System.out.println("Size after clearing: " + map.size()); // Outputs: 0
    }
}
