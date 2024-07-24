# ArrayDeque README

## Overview

`ArrayDeque` in Java is part of the Java Collections Framework and implements the `Deque` interface, utilizing a resizable array to facilitate efficient operations at both ends without the overhead of node allocation.

## Features

- **Efficiency**: Superior to `Stack` and `LinkedList` for stack and queue operations due to minimal overhead.
- **No Null Elements**: Enhances stability and performance by not permitting null elements.

---

## Key Operations

### 1. Initialization

- Initialize an `ArrayDeque`:
  ```java
  ArrayDeque<Integer> deque = new ArrayDeque<>();
  ```

### 2. Adding Elements

- Add elements efficiently to both ends:
  ```java
  deque.offer("Apple");  // Adds to the end
  deque.addFirst("Banana");  // Adds to the front
  ```

### 3. Accessing Elements

- Access elements from either end:
  ```java
  String first = deque.peekFirst();  // Returns the first element without removing
  String last = deque.peekLast();  // Returns the last element without removing
  ```

### 4. Removing Elements

- Remove elements from both ends:
  ```java
  String removeFirst = deque.pollFirst();  // Removes and returns the first element
  String removeLast = deque.pollLast();  // Removes and returns the last element
  ```

### 5. Check Size and Emptiness

_Check the size of the deque and whether it is empty:_

```java
int size = deque.size();  // Returns the number of elements
boolean isEmpty = deque.isEmpty();  // Returns true if empty
```

### 6. Clearing the ArrayDeque

_Clear all elements from the `ArrayDeque`:_

```java
deque.clear();
```

### 7. Iterating Through ArrayDeque

_Iterate through `ArrayDeque` using an enhanced for loop:_

```java
for (String fruit : deque) {
    System.out.println(fruit);
}
```

---

## Use Cases

- **Efficiency in Operations**: Ideal for applications requiring quick additions and removals from both ends.
- **Memory Optimization**: Bigger memory overhead compared to linked structures.

---

---

---

