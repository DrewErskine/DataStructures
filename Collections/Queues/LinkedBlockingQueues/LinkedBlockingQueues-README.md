# LinkedBlockingQueue README

## Overview

`LinkedBlockingQueue` in Java is part of the Java Collections Framework and implements the `BlockingQueue` interface. It uses a linked node structure to provide capacity-restricted queue operations that block when the queue is empty or full, making it suitable for concurrent applications.

## Features

- **Concurrency**: Supports multiple producers and consumers with high throughput.
- **Capacity Restriction**: Optionally bounded to prevent excessive resource consumption.
- **Thread Safety**: Blocking operations enhance thread safety by properly synchronizing access.

---

## Key Operations

### 1. Initialization

- Initialize a `LinkedBlockingQueue` with default capacity:
  ```java
  LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
  ```

- Initialize with specific capacity:
  ```java
  LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(10);
  ```

### 2. Adding Elements

- Add elements to the queue, blocking if no space is available:
  ```java
  try {
      queue.put("Apple");  // Blocks if the queue is full
  } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
  }
  ```

### 3. Accessing Elements

- Retrieve and remove the head of the queue, blocking until an element is available:
  ```java
  try {
      String head = queue.take();  // Blocks if the queue is empty
  } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
  }
  ```

### 4. Checking Capacity

- Check if the queue is full and capacity left:
  ```java
  boolean isFull = queue.remainingCapacity() == 0;
  int capacityLeft = queue.remainingCapacity();
  ```

### 5. Iterating Through LinkedBlockingQueue

_Iterate through `LinkedBlockingQueue` using an iterator:_

```java
Iterator<String> iterator = queue.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### 6. Check Size and Emptiness

_Check the size of the queue and whether it is empty:_

```java
int size = queue.size();  // Returns the number of elements
boolean isEmpty = queue.isEmpty();  // Returns true if empty
```

### 7. Clearing the LinkedBlockingQueue

_Clear all elements from the `LinkedBlockingQueue`:_

```java
queue.clear();
```

---

## Use Cases

- **Producer-Consumer Scenarios**: Ideal for scenarios where you need to safely handle data between multiple threads.
- **Resource Management**: Useful in managing resources where maintaining a specific number of tasks or items is crucial.

---

---

---

