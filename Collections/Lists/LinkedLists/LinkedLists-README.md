# LinkedList README

## Overview

`LinkedList` in Java implements the `List` interface using a doubly-linked list structure. It facilitates efficient insertion and removal of elements at both ends, making it ideal for applications requiring dynamic data manipulation.

## Features

- **Dynamic Structure:** Facilitates easy insertion and removal of elements.
- **Element Access:** Provides sequential access to elements, which can be faster for modifications at ends.
- **Dual-Ended Operations:** Supports operations at both the head and tail of the list.
- **Iterator Support:** Includes methods to iterate forwards and backwards.

---

## Key Operations

### 1. Initialization

- Initialize a `LinkedList`:
  ```java
  LinkedList<String> list = new LinkedList<>();
  ```

### 2. Adding Elements

- Add elements to the `LinkedList`:
  ```java
  list.add("Apple"); // Adds to the end of the list
  list.addFirst("Banana"); // Adds to the front of the list
  list.add(1, "Cherry"); // Adds Cherry at the second position
  ```

### 3. Accessing Elements

- Access elements from the front and end:
  ```java
  String firstFruit = list.getFirst(); // Retrieves the first element
  String lastFruit = list.getLast(); // Retrieves the last element
  ```

### 4. Removing Elements

- Remove elements from the front and end:
  ```java
  list.removeFirst(); // Removes the first element
  list.removeLast(); // Removes the last element
  ```

### 5. Special LinkedList Operations

- Perform specialized operations:
  ```java
  list.addLast("Strawberry"); // Adds to the end of the list
  String peek = list.peekFirst(); // Peeks at the first element without removing
  String polled = list.pollFirst(); // Retrieves and removes the first element
  String peekLast = list.peekLast(); // Peeks at the last element without removing
  String pollLast = list.pollLast(); // Retrieves and removes the last element
  ```

### 6. Check Size and Emptiness

_Check the size of the list and whether it is empty:_

```java
int size = list.size(); // Returns the number of elements
```
```java
boolean isEmpty = list.isEmpty(); // Returns true if the list is empty
```

### 7. Clearing the LinkedList

_Clear all entries from the `LinkedList`:_

```java
list.clear();
```

### 8. Iterating Through LinkedList

_Iterate through the `LinkedList`:_
```java
for(String fruit : list) {
   System.out.println(fruit);
}
```

---

## Use Cases

- **Dynamic Operations**: Highly effective for applications requiring frequent additions and removals at both ends.
- **Stack/Main Queue and Deque Structure**: Perfect for use in stack (LIFO - Last In, First Out) and deque structures due to its ability to quickly add and remove elements from both ends.
---

---

---

