# README for PriorityQueue in Java

## Overview

`PriorityQueue` in Java is part of the Java Collections Framework and is implemented using a priority heap. It stores elements based on priority, which can be determined by natural ordering or through a custom comparator provided at the time of queue construction.

## Features

- **No Null Elements**: Null elements are not permitted in the queue.
- **Ordering**: Elements are ordered either by their natural ordering or by a comparator provided during construction. Note that the queue does not necessarily represent this order explicitly in its structure.
- **Performance**: Provides O(log n) time complexity for insertions and deletions.

## Key Operations

### 1. Initialization

- Without a comparator:
  `PriorityQueue<Integer> pq = new PriorityQueue<>();`

- With a custom comparator (reverse order):
  `PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());`

### 2. Adding Elements

- Add elements to the queue:
  `pq.offer("Apple");`
  `pq.offer("Banana");`
  `pq.offer("Cherry");`

### 3. Accessing Elements

- Peek at the highest priority element (the head of the queue):
  `String head = pq.peek();` // Returns "Apple" if natural order is alphabetical

### 4. Removing Elements

- Remove the element with the highest priority:
  `String removedElement = pq.poll();` // Removes and returns "Apple"

### 5. Iterating Through PriorityQueue

- Continuously poll the queue:
  ```
  while (!pq.isEmpty()) {
    System.out.println(pq.poll());
  }
  ```

### 6. Size, Empty, Clear Operations

- Check the size of the queue and if it is empty:
  `int size = pq.size();`
  `boolean isEmpty = pq.isEmpty();`

- Clear the queue:
  `pq.clear();`

## Use Cases

- **Task Scheduling**: Suitable for scheduling tasks where priorities are necessary to determine the processing order.
- **Data Stream Management**: Useful in scenarios where managing data streams based on priority is essential.

---
---


## PriorityQueue - Comparators

### Example Task Prioritization

- Define a task class with a priority based on color:

  ```
  class Task {
    String name;
    String color;

    Task(String name, String color) {
        this.name = name;
        this.color = color;
    }
  }
  ```

- Implement a comparator to prioritize tasks by color:

  ```
  class TaskComparator implements Comparator<Task> {
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
  ```

---
---
---
