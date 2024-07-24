# README for LinkedBlockingQueue in Java

## Overview

`LinkedBlockingQueue` in Java is part of the Java Collections Framework and implements the `BlockingQueue` interface. It is an optionally-bounded blocking queue based on linked nodes, making it suitable for producer-consumer scenarios where a thread-safe operation is essential.

## Features

- **Thread-Safe**: Blocking operations on `put` and `take` ensure that it can safely be used by multiple threads without external synchronization.
- **Optionally-Bounded**: The capacity can be set at the time of queue creation, or it can be left unbounded.
- **Producer-Consumer Use**: Ideal for scenarios involving multiple threads producing and consuming elements from the queue.

## Key Operations

### 1. Initialization

- With specified capacity:

      `BlockingQueue<String> queue = new LinkedBlockingQueue<>(30);`

### 2. Adding Elements

- Elements are added to the queue, and the operation will block if the queue is full:

      `queue.put("Banana");`

### 3. Accessing Elements

- Peek at the head of the queue without removing the element:

      `String head = queue.peek();` ---> Returns the first element added, first out

### 4. Removing Elements

- Take an element from the queue; this operation blocks if the queue is empty:

      `String removedElement = queue.take();` ---> Removes and returns the head

### 5. Iterating Over LinkedBlockingQueue

- Iterate through the elements in the queue:
  
  ```
  for (String fruit : queue) {
    System.out.println(fruit);
  }
  ```

### 6. Check Size and if Empty

- Check if the queue is empty and for its size:

  `boolean isEmpty = queue.isEmpty();`

  `int size = queue.size();`

### 7. Clear

- Clear all elements from the queue:

  `queue.clear();`

## Use Cases

- **Producer-Consumer Patterns**: Highly suitable for scenarios with more than one producer or consumer.
- **Resource Management**: Effective in environments where resources are limited and need to be managed efficiently.



---
---

## Handling Concurrency

### Blocking Operations

- **put(E)**: Automatically blocks the thread if there is no space available until space becomes available.
- **take()**: Blocks the threads if there are no elements in the queue until an element is inserted.

### Example Usage

- Example of setting up a producer and consumer with `LinkedBlockingQueue`:

  ```
  class Main {
  public static void main(String[] args) {
  BlockingQueue<String> queue = new LinkedBlockingQueue<>();

          Thread producer = new Thread(new Producer(queue));
          Thread consumer = new Thread(new Consumer(queue));

          producer.start();
          consumer.start();

          try {
              producer.join();
              consumer.join();
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
              System.out.println("Thread interrupted");
          }
      }
  }
  ```

---
---
---
