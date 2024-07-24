# TreeSet README

## Overview

`TreeSet` in Java is an implementation of the `Set` interface using a `TreeMap` as its backbone. It maintains elements in sorted order, either through their natural ordering or by a comparator provided at set creation. This structure uses a Red-Black tree, ensuring that each operation runs in logarithmic time.

## Features

- **Order Maintenance**: Automatically sorts elements upon addition.
- **Red-Black Tree Structure**: Ensures log(n) time complexity for essential operations like add, remove, and contains.
- **No Duplicates**: Duplicate values are automatically ignored.

---

## Key Operations

### 1. Initialization

- Initialize with natural ordering:
  ```java
  TreeSet<String> treeSet = new TreeSet<>();
  ```

- Initialize with a custom comparator:
  ```java
  TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
  ```

### 2. Adding Elements

- Add elements to the set:
  ```java
  treeSet.add("Banana");
  treeSet.add("Apple");
  treeSet.add("Cherry");
  ```

### 3. Removing Elements

- Remove a specific element:
  ```java
  treeSet.remove("Apple");
  ```

### 4. Accessing Elements

- Retrieve the lowest and highest element:
  ```java
  String head = treeSet.first();  // Returns the lowest element
  String tail = treeSet.last();   // Returns the highest element
  ```

- Retrieve subsets:
  ```java
  SortedSet<String> headSet = treeSet.headSet("Cherry"); // Elements less than "Cherry"
  SortedSet<String> tailSet = treeSet.tailSet("Banana"); // Elements greater than or equal to "Banana"
  ```

### 5. Check Size and Emptiness

_Check the size of the set and whether it is empty:_

```java
int size = treeSet.size(); // Returns the number of elements
boolean isEmpty = treeSet.isEmpty(); // Returns true if empty
```

### 6. Clearing the TreeSet

_Clear all entries from the `TreeSet`:_

```java
treeSet.clear();
```

### 7. Iterating Through TreeSet

_Iterate through elements in the `TreeSet`:_

```java
for (String item : treeSet) {
    System.out.println(item);
}
```

---

## Use Cases

- **Sorted Data Management**: Ideal for managing data that must be retrieved in an ordered manner.
- **Ranged Queries**: Efficient for performing range searches, particularly useful in scenarios requiring sorted output.

---

## TreeSet - Comparators

### Overview

Comparators in a `TreeSet` control the order of elements stored within the set. They allow for customization beyond natural ordering, facilitating order based on attributes defined by the user.

### Example Usage

- Define a `TreeSet` with a custom comparator to order elements in reverse:

  ```java
  Comparator<String> reverseOrderComparator = Comparator.reverseOrder();
  TreeSet<String> treeSet = new TreeSet<>(reverseOrderComparator);
  ```

- Adding elements:
  ```java
  treeSet.add("Banana");
  treeSet.add("Apple");
  treeSet.add("Cherry");
  ```

- The elements will be stored in reverse alphabetical order due to the comparator.

### Implementing a Comparator

- Comparators can be implemented to specify different ordering:

  ```java
  class CustomComparator implements Comparator<String> {
      @Override
      public int compare(String a, String b) {
          return b.compareTo(a); // Reverse order
      }
  }
  TreeSet<String> customSet = new TreeSet<>(new CustomComparator());
  ```

---

---

---
