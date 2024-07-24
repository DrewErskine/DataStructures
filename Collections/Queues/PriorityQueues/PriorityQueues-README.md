# PriorityQueue README

## Overview

`PriorityQueue` in Java is part of the Java Collections Framework and implements the `Queue` interface. It is used to process elements in a priority-based order rather than the conventional FIFO order of regular queues. `PriorityQueue` is typically backed by a heap structure to enable efficient insertion and removal of elements.

## Features

- **Priority-Based Ordering**: Elements are ordered according to their natural ordering or by a comparator provided at queue construction.
- **Efficiency**: Offers efficient enqueue and dequeue operations in logarithmic time.
- **Comparator Support**: Allows custom ordering of elements through comparators.

---

## Key Operations

### 1. Initialization

- Initialize a `PriorityQueue` with natural ordering:
  ```java
  PriorityQueue<String> pq = new PriorityQueue<>();
  ```

- Initialize with a custom comparator:
  ```java
  PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
  ```

### 2. Adding Elements

- Add elements to the queue:
  ```java
  pq.offer("Apple");
  pq.offer("Banana");
  pq.offer("Cherry");
  ```

### 3. Accessing Elements

- Peek at the highest priority element (the head of the queue):
  ```java
  String head = pq.peek(); // Returns the highest priority element
  ```

### 4. Removing Elements

- Remove the element with the highest priority:
  ```java
  String removedElement = pq.poll(); // Removes and returns the highest priority element
  ```

### 5. Iterating Through PriorityQueue

- Continuously poll the queue to process elements by priority:
  ```java
  while (!pq.isEmpty()) {
      System.out.println(pq.poll()); // Prints elements in priority order
  }
  ```

### 6. Check Size, Empty, and Clear Operations

_Check the size of the queue, if it is empty, and clear operations:_

```java
int size = pq.size(); // Returns the number of elements
boolean isEmpty = pq.isEmpty(); // Returns true if empty
pq.clear(); // Clears all elements from the queue
```

---

## Use Cases

- **Task Scheduling**: Suitable for scheduling tasks where priorities are necessary to determine the processing order.
- **Data Stream Management**: Useful in scenarios where managing data streams based on priority is essential.

---

## PriorityQueue - Comparators

### Example Task Prioritization

- Define a task class with a priority based on color:

  ```java
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

  ```java
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


---

---

