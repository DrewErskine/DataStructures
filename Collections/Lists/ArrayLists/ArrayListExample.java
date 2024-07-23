package Collections.Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create and initialize an ArrayList
        List<String> list = new ArrayList<>();
        initializeList(list);

        // Access a value
        accessValue(list);

        // Check if a value exists
        checkValue(list);

        // Iterate through the ArrayList
        iterateList(list);

        // Remove an entry
        removeEntry(list);

        // Check the size of the ArrayList
        checkSize(list);

        // Clear the ArrayList
        clearList(list);
    }

    private static void initializeList(List<String> list) {
        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Initialized ArrayList: " + list);
    }

    private static void accessValue(List<String> list) {
        // Access a value by index
        String fruit = list.get(0);
        System.out.println("First fruit: " + fruit); // Outputs: First fruit: Apple
    }

    private static void checkValue(List<String> list) {
        // Check if a value exists
        boolean hasBanana = list.contains("Banana");
        System.out.println("Has Banana: " + hasBanana); // Outputs: Has Banana: true
    }

    private static void iterateList(List<String> list) {
        // Iterate through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    private static void removeEntry(List<String> list) {
        // Remove an entry
        list.remove("Orange");
        System.out.println("After removing Orange: " + list);
    }

    private static void checkSize(List<String> list) {
        // Check the size of the ArrayList
        int size = list.size();
        System.out.println("Size: " + size); // Outputs: Size: 2
    }

    private static void clearList(List<String> list) {
        // Clear the ArrayList
        list.clear();
        System.out.println("Size after clearing: " + list.size()); // Outputs: Size after clearing: 0
    }
}