## Overview

`TreeMap` in Java is part of the Java Collections Framework and implements the Map interface. It maintains a sorted order of its keys according to their natural ordering or by a comparator provided at the map's creation. It is implemented using a red-black tree structure.

## Features

- **Natural Ordering**: By default, TreeMap sorts the keys according to their natural order. It can also accept a custom Comparator for custom sort order.
- **Performance**: Provides O(log n) time complexity for common operations such as insertions, deletions, and lookups.
- **Key Constraints**: Does not permit null keys (if relying on natural ordering), as it uses the Comparable interface to determine the data's order.

## Key Operations

### 1. Initialization

- Initialize a `TreeMap` without a comparator:
  ```java
  TreeMap<Integer, String> map = new TreeMap<>();
  ```

- Initialize a `TreeMap` with a custom comparator:
  ```java
  TreeMap<String, String> map = new TreeMap<>(Comparator.reverseOrder());
  ```

### 2. Adding Elements

- Add elements to the TreeMap:
  ```java
  map.put(3, "Apple");
  map.put(1, "Banana");
  map.put(2, "Cherry");
  ```

### 3. Accessing Elements

- Access an element by key:
  ```java
  String fruit = map.get(1); // Returns "Banana"
  ```

### 4. Accessing First and Last Elements

- Access the first and last keys:
  ```java
  System.out.println(map.firstKey());` // Prints the smallest key
  System.out.println(map.lastKey());` // Prints the largest key
  ```

### 5. Removing Elements

- Remove an element by key:
  ```java
  map.remove(2);
  ```

### 6. SubMap Operations

- Create a subMap from the TreeMap:
  ```java
  SortedMap<Integer, String> subMap = map.subMap(1, 3);` // Includes keys 1 inclusive to 3 exclusive
  ```

### 7. Check Size and Emptiness

_Check the size of the map and whether it is empty:_

```java
int size = map.size(); // Returns the number of elements in the map
```
```java
boolean isEmpty = map.isEmpty(); // Return True if empty
```

### 8. Clearing the TreeMap

_Clear all entries from the `TreeMap`_

```java
map.clear();
```


### 9. Iterating Through TreeMap

_Iterate through entries in the `TreeMap`:_

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
   System.out.println(entry.getKey() + " => " + entry.getValue());
}
```

---

## Use Cases

- **Ordered Map**: Ideal for applications that require a map to maintain its keys in sorted order, ensuring that data is always organized.
- **Sorted Data Management**: Suitable for scenarios like maintaining a naturally ordered list of records, making it easier to manage and query sorted data.
- **Range Searches**: Perfect for use cases where frequent range searches are necessary, as `TreeMap` provides efficient operations to retrieve subsets of data based on sorted keys.

---

---

---
