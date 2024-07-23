# README for LinkedHashMap in Java

## Overview

LinkedHashMap in Java extends HashMap and maintains a linked list of the entries in the map, which allows it to maintain the order of insertion. This feature makes LinkedHashMap especially useful when you need to preserve the order in which keys were inserted into the map. It can also be configured to maintain access order, making it suitable for building LRU caches.

## Features

- **Order Maintenance:** Maintains insertion order of entries by default; can be configured for access order.
- **Performance:** Offers constant time performance for the common operations (get and put), provided the hash function disperses the elements properly among the buckets.
- **Structure:** Stores data in key-value pairs and contains a doubly-linked list running through its entries to maintain order.

---

## Key Operations

1. **Initialization**
   LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

2. **Adding Elements**
   map.put(1, "Apple");
   map.put(2, "Banana");

3. **Accessing Elements**
   String value = map.get(1); // Returns "Apple"

4. **Checking for a Key or Value**
   boolean hasKey = map.containsKey(1); // Returns true
   boolean hasValue = map.containsValue("Banana"); // Returns true

5. **Removing Elements**
   map.remove(2); // Removes the entry with key 2

6. **Iterating Through LinkedHashMap**
   for (Map.Entry<Integer, String> entry : map.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + ": " + value);
   }

7. **Size**
   int size = map.size(); // Returns the number of key-value pairs in the map

8. **Clear**
   map.clear(); // Removes all entries from the map

---

## Use Cases

`LinkedHashMap` is perfect for maintaining insertion order of elements, useful in scenarios like cache implementations where order affects which entries get evicted, such as in LRU caches.