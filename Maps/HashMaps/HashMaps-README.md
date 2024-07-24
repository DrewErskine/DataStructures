# README for HashMap in Java

## Overview

`HashMap` in Java is a part of the Java Collections Framework. It stores data as key-value pairs and does not maintain any order among its entries. It provides efficient data retrieval operations, making it a highly used data structure for storing large sets of data where the keys are unique.

## Features

- **Performance:** `HashMap` offers O(1) time complexity for `put`, `get`, `remove`, and `containsKey` operations under the ideal hashing conditions.
- **Structure:** `HashMap` is implemented using an array of buckets or bins, which store the entries.

---

## Key Operations

1. **Initialization**

      `HashMap<Integer, String> map = new HashMap<>();## Key Operations`

2. **Adding an element**

      `map.put(1, "Apple");`
      `map.put(2, "Banana");`

3. **Accessing an element**

      `String value = map.get(1);` --> Returns "Apple"

4. **Check for a Key or Value**

      `boolean hasKey = map.containsKey(1);` --> Returns true
      `boolean hasValue = map.containsValue("Banana");` --> Returns False

5. **Remove Element**

      `map.remove(2);` --> Removes the entry with key 2

6. **Iterate Through HashMap**

   ```
   for (Map.Entry<Integer, String> entry : map.entrySet()) {
       Integer key = entry.getKey();
       String value = entry.getValue();
       System.out.println(key + ": " + value);
   }
   ```

7. **Size**

   `int size = map.size();` --> Returns the number of key-value pairs in the map

8. **Clear**

   `map.clear();` --> Removes all entries from the map

---

## Use Cases

- **Fast Access**: Crucial for applications requiring rapid access to elements where the key's order is not important, such as hashing functions.
- **Indexing**: Ideal for indexing operations where unique keys need to be mapped to specific values quickly, ensuring efficient data retrieval.

---
---
---
