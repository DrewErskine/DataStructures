# README for ArrayDeque in Java

## Overview

`ArrayDeque` in Java is part of the Java Collections Framework and implements the `Deque` interface. It uses a resizable array, making it highly versatile for both stack and queue operations. `ArrayDeque` allows elements to be added or removed from both ends efficiently, without the overhead of node allocation required by linked structures.

## Features

- **Efficiency**: More efficient than `Stack` and `LinkedList` for stack and queue operations because it avoids the overhead of node allocation.
- **No Null Elements**: Does not permit null elements, enhancing stability and performance.

---

## Key Operations

### 1. Initialization

- Initialize an `ArrayDeque`:
  `ArrayDeque<Integer> deque = new ArrayDeque<>();`

### 2. Adding Elements

- Add elements to the end and the front:
  `deque.offer("Apple");` // Adds to the end of the deque
  `deque.addFirst("Banana");` // Adds to the front of the deque

### 3. Accessing Elements

- Access elements from the front and the end:
  `String first = deque.peekFirst();` // Returns the first element without removing
  `String last = deque.peekLast();` // Returns the last element without removing

### 4. Removing Elements

- Remove elements from the front and the end:
  `String removeFirst = deque.pollFirst();` // Removes and returns the first element
  `String removeLast = deque.pollLast();` // Removes and returns the last element

### 5. Iterating Through ArrayDeque

- Iterate through `ArrayDeque` using enhanced for loop:
  ```
  for (String fruit : deque) {
      System.out.println(fruit);
  }
  ```

### 6. Check Size and if Empty

- Check if the deque is empty and its size:
  `int size = deque.size();` // Returns the number of elements in the deque
  `boolean isEmpty = deque.isEmpty();` // Checks if the deque is empty

### 7. Clear

- Clear all elements from the deque:
  `deque.clear();` // Removes all elements from the deque

---

## Use Cases

`ArrayDeque` is ideal for applications that require efficient additions and removals from both ends of a collection. It is particularly well-suited for implementing both stacks (LIFO) and queues (FIFO), where quick access and modification are crucial.