# README for TreeMap in Java

## Overview

TreeMap in Java is part of the Java Collections Framework and implements the Map interface. It maintains a sorted order of its keys according to their natural ordering or by a comparator provided at the map's creation. It is implemented using a red-black tree structure.

## Features

- Natural Ordering: By default, TreeMap sorts the keys according to their natural order. It can also accept a custom Comparator for custom sort order.
- Performance: Provides O(log n) time complexity for common operations such as insertions, deletions, and lookups.
- Key Constraints: Does not permit null keys (if relying on natural ordering), as it uses the Comparable interface to determine the data's order.

---

## Key Operations

1. Initialization

   - Without a comparator:
     - ```TreeMap<Integer, String> map = new TreeMap<>();```

   - With a custom comparator:
     - ```TreeMap<String, String> map = new TreeMap<>(Comparator.reverseOrder());```

2. Adding Elements
   - ```map.put(3, "Apple");```
   - ```map.put(1, "Banana");```
   - ```map.put(2, "Cherry");```

3. Accessing Elements
   - ```String fruit = map.get(1);``` --> Returns "Banana"

4. Iterating Through TreeMap
   ```
   for (Map.Entry<Integer, String> entry : map.entrySet()) {
   System.out.println(entry.getKey() + " => " + entry.getValue());
   }
   ```

5. First and Last Elements
   - ```System.out.println(map.firstKey());``` --> Prints the smallest key
   - ```System.out.println(map.lastKey());``` --> Prints the largest key

6. SubMap Operations
   - ```SortedMap<Integer, String> subMap = map.subMap(1, 3);``` --> Includes keys 1 inclusive to 3 exclusive

7. Removing Elements
   - ```map.remove(2);```

8. Clearing the TreeMap
   - ```map.clear();```

---

## Use Cases

`TreeMap` is ideal for applications where an ordered map is crucial. It is suitable for scenarios such as implementing a sorted map, maintaining a naturally ordered list of records, or where range searches are frequent operations.