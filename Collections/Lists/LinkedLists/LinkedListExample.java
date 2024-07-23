package Collections.Lists.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create and initialize a LinkedList
        List<String> list = new LinkedList<>();
        initializeList(list);

        // Access a value
        accessValue(list);

        // Check if a value exists
        checkValue(list);

        // Iterate through the LinkedList with enhanced for-loop
        iterateList(list);

        // Iterate through the LinkedList with standard for-loop
        iterateList2(list);

        // Remove an entry
        removeEntry(list);

        // Poll the last entry
        pollLastEntry(list);

        // Check the size of the LinkedList
        checkSize(list);

        // Clear the LinkedList
        clearList(list);
    }

    private static void initializeList(List<String> list) {
        // Add elements to the LinkedList
        ((LinkedList<String>)list).addFirst("Apple");
        list.add("Banana"); // Adds to the end
        list.add("Orange");
        System.out.println("Initialized LinkedList: " + list);
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
        // Iterate through the LinkedList using enhanced for-loop
        System.out.println("Iterating through the LinkedList with enhanced for-loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    private static void iterateList2(List<String> list) {
        // Iterate through the LinkedList using standard for-loop
        System.out.println("Iterating through the LinkedList with standard for-loop:");
        for (int i = 0; i < list.size(); i++) {
            String fruit = list.get(i);
            System.out.println(fruit);
        }
    }

    private static void removeEntry(List<String> list) {
        // Remove an entry
        list.remove("Orange");
        System.out.println("After removing Orange: " + list);
    }

    private static void pollLastEntry(List<String> list) {
        // Poll the last entry
        String lastFruit = ((LinkedList<String>)list).pollLast();
        System.out.println("Polled last fruit: " + lastFruit + ", Remaining List: " + list);
    }

    private static void checkSize(List<String> list) {
        // Check the size of the LinkedList
        int size = list.size();
        System.out.println("Size: " + size); // Outputs: Size: 2
    }

    private static void clearList(List<String> list) {
        // Clear the LinkedList
        list.clear();
        System.out.println("Size after clearing: " + list.size()); // Outputs: Size after clearing: 0
    }
}