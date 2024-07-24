# HashMap README

## Overview

`HashMap` in Java is a part of the Java Collections Framework. It stores data as key-value pairs and does not maintain any order among its entries. It provides efficient data retrieval operations, making it a highly used data structure for storing large sets of data where the keys are unique.

## Features

- **Performance:** `HashMap` offers O(1) time complexity for `put`, `get`, `remove`, and `containsKey` operations under ideal hashing conditions.
- **Structure:** `HashMap` is implemented using an array of buckets or bins, which store the entries.

---

## Key Operations

### 1. Initialization

- Initialize a `HashMap`:
  ```java
  HashMap<Integer, String> map = new HashMap<>();
  ```

### 2. Adding Elements

- Add elements to the `HashMap`:
  ```java
  map.put(1, "Apple");
  map.put(2, "Banana");
  ```

### 3. Accessing Elements

- Access an element by key:
  ```java
  String value = map.get(1); // Returns "Apple"
  ```

### 4. Checking for a Key or Value

- Check if a key or value is present in the map:
  ```java
  boolean hasKey = map.containsKey(1); // Returns true
  boolean hasValue = map.containsValue("Banana"); // Returns false
  ```

### 5. Removing Elements

- Remove an element by key:
  ```java
  map.remove(2); // Removes the entry with key 2
  ```

### 6. Iterating Through HashMap

- Iterate through entries:
  ```java
  for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + value);
  }
  ```

### 7. Check Size and Emptiness

_Check the size of the map and whether it is empty:_

```java
int size = map.size(); // Returns the number of key-value pairs in the map
```
```java
boolean isEmpty = map.isEmpty(); // Return True if empty
```

### 8. Clearing the HashMap

_Clear all entries from the `HashMap`:_

```java
map.clear();
```

---

## Use Cases

- **Fast Access**: Crucial for applications requiring rapid access to elements where the key's order is not important, such as hashing functions.
- **Indexing**: Ideal for indexing operations where unique keys need to be mapped to specific values quickly, ensuring efficient data retrieval.

---

---

---

