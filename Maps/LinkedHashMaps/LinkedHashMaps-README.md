# LinkedHashMap README

## Overview

`LinkedHashMap` in Java extends HashMap and maintains a linked list of the entries in the map, which allows it to maintain the order of insertion. This feature makes LinkedHashMap especially useful when you need to preserve the order in which keys were inserted into the map. It can also be configured to maintain access order, making it suitable for building LRU caches.

## Features

- **Order Maintenance:** Maintains insertion order of entries by default; can be configured for access order.
- **Performance:** Offers constant time performance for the common operations (get and put), provided the hash function disperses the elements properly among the buckets.
- **Structure:** Stores data in key-value pairs and contains a doubly-linked list running through its entries to maintain order.

---

## Key Operations

### 1. Initialization

- Initialize a `LinkedHashMap` without a comparator:
  ```java
  LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
  ```

### 2. Adding Elements

- Add elements to the `LinkedHashMap`:
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
  boolean hasValue = map.containsValue("Banana"); // Returns true
  ```

### 5. Removing Elements

- Remove an element by key:
  ```java
  map.remove(2); // Removes the entry with key 2
  ```

### 6. Check Size and Emptiness

_Check the size of the map and whether it is empty:_

```java
int size = map.size(); // Returns the number of key-value pairs in the map
```
```java
boolean isEmpty = map.isEmpty(); // Return True if empty
```

### 7. Clearing the LinkedHashMap

_Clear all entries from the `LinkedHashMap`:_

```java
map.clear();
```

### 8. Iterating Through LinkedHashMap

_Iterate through entries using enhanced for loop:_

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
   Integer key = entry.getKey();
   String value = entry.getValue();
   System.out.println(key + ": " + value);
}
```

---

## Use Cases

- **Order Preservation**: Essential for applications that require elements to be maintained in the order they were added, supporting predictable iteration over entries.
- **Cache Implementations**: Extremely useful in caching mechanisms, particularly those utilizing least-recently-used (LRU) policies where maintaining order directly impacts cache performance.

---

---

---
