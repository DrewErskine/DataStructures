package Collections.Queues.ArrayDeques;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    
    public static void main(String[] args) {
        // Initialize an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.offer("Apple");  // Adds to the end
        deque.addFirst("Banana");  // Adds to the front

        // Accessing elements
        String first = deque.peekFirst();  // Returns the first element without removing
        String last = deque.peekLast();  // Returns the last element without removing
        System.out.println("First: " + first);
        System.out.println("Last: " + last);

        // Removing elements
        String removeFirst = deque.pollFirst();  // Removes and returns the first element
        String removeLast = deque.pollLast();  // Removes and returns the last element
        System.out.println("Removed First: " + removeFirst);
        System.out.println("Removed Last: " + removeLast);

        // Reinitialize for demonstration
        deque.offerFirst("Mango");
        deque.offerLast("Strawberry");

        // Check size and emptiness
        int size = deque.size();  // Returns the number of elements
        boolean isEmpty = deque.isEmpty();  // Returns true if empty
        System.out.println("Size: " + size);
        System.out.println("Is empty: " + isEmpty);

        // Clearing the ArrayDeque
        deque.clear();
        System.out.println("Size after clearing: " + deque.size());

        // Adding elements again for iteration demo
        deque.offer("Pineapple");
        deque.offerFirst("Grapes");

        // Iterating through ArrayDeque
        System.out.println("Iterating through ArrayDeque:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
    }
}
