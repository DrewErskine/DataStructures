package Collections.Queues.PriorityQueues;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample {
    
    static class Task {
        String name;
        String color;

        Task(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.color;
        }
    }

    static class TaskComparator implements Comparator<Task> {
        public int compare(Task t1, Task t2) {
            return Integer.compare(getPriority(t1.color), getPriority(t2.color));
        }

        private int getPriority(String color) {
            switch (color.toLowerCase()) {
                case "red":
                    return 1;
                case "yellow":
                    return 2;
                case "blue":
                    return 3;
                default:
                    return 4;
            }
        }
    }

    public static void main(String[] args) {
        // Initialize PriorityQueue with a custom comparator for tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new TaskComparator());

        // Adding tasks to the queue
        taskQueue.offer(new Task("Read Book", "Yellow"));
        taskQueue.offer(new Task("Write Code", "Blue"));
        taskQueue.offer(new Task("Exercise", "Red"));

        // Display the highest priority task
        System.out.println("Highest priority task: " + taskQueue.peek());

        // Remove the highest priority task and display it
        System.out.println("Removed task: " + taskQueue.poll());

        // Check size, if empty, and clear operations before printing the tasks
        int size = taskQueue.size();
        boolean isEmpty = taskQueue.isEmpty();
        System.out.println("Size: " + size);
        System.out.println("Is empty: " + isEmpty);

        // Iterate through PriorityQueue to process tasks by priority
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll()); // Prints tasks in priority order
        }

        // Clear the queue and check size
        taskQueue.clear();
        System.out.println("Size after clearing: " + taskQueue.size());
    }
}
