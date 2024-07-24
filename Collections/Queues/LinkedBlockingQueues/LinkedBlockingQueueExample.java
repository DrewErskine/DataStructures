package Collections.Queues.LinkedBlockingQueues;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    
    public static void main(String[] args) {
        // Initialize a LinkedBlockingQueue with default capacity
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Initialize with specific capacity
        LinkedBlockingQueue<String> boundedQueue = new LinkedBlockingQueue<>(10);

        // Adding elements, blocks if the queue is full
        try {
            queue.put("Apple");  // Attempt to add an item; blocks if full
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Proper handling of InterruptedException
        }

        // Accessing elements, blocks until an element is available
        try {
            String head = queue.take();  // Blocks if the queue is empty
            System.out.println("Head of the queue: " + head);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Reinitialize to demonstrate remaining operations
        queue.offer("Banana");
        queue.offer("Cherry");

        // Checking capacity
        boolean isFull = queue.remainingCapacity() == 0;
        int capacityLeft = queue.remainingCapacity();
        System.out.println("Is full: " + isFull);
        System.out.println("Capacity left: " + capacityLeft);

        // Iterating through LinkedBlockingQueue
        Iterator<String> iterator = queue.iterator();
        System.out.println("Iterating through LinkedBlockingQueue:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check size and emptiness
        int size = queue.size();
        boolean isEmpty = queue.isEmpty();
        System.out.println("Size of the queue: " + size);
        System.out.println("Is the queue empty: " + isEmpty);

        // Clearing the LinkedBlockingQueue
        queue.clear();
        System.out.println("Size after clearing: " + queue.size());
    }
}
