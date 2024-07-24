# README for ArrayList in Java

## Overview

`ArrayList` in Java is a resizable array implementation of the `List` interface. It provides a way to store elements dynamically, allowing for expansion as new elements are added. `ArrayList` maintains the order of insertion and allows for random access to elements, making it a versatile and widely used collection type.

## Features

- **Dynamic Resizing:** Automatically resizes to accommodate new elements.
- **Element Storage:** Stores elements in an array format.
- **Order Maintenance:** Maintains the insertion order of elements.
- **Performance:** Offers constant time complexity for retrieving an element at a specific index.

---

## Key Operations

1. **Initialization**

      `ArrayList<String> list = new ArrayList<>();`

2. **Adding Elements**

      `list.add("Apple");` --> Adds Apple to the list

3. **Adding to a Specific Index**

      `list.add(0, "Banana");` --> Adds Banana at the beginning of the list

4. **Accessing Elements**

      `String fruit = list.get(0);` --> Accesses the first element (Banana)

5. **Updating an Element**

      `list.set(0, "Cherry");` --> Replaces Banana with Cherry at index 0

6. **Removing an Element**

      `list.remove("Apple");` --> Removes Apple from the list

7. **Iterating Through an ArrayList**

   ```
   for(String fruit : list) {
       System.out.println(fruit);
   }
   ```

8. **Check Size of ArrayList**

   `int size = list.size();` --> Returns the number of elements in the list

9. **Check if Empty**

   `boolean isEmpty = list.isEmpty();` --> Returns true if the list is empty

10. **Clear List**

   `list.clear();` --> Removes all elements from the list

11. **Sorting**
   `Collections.sort(list);` --> Sorts the list in ascending order

---

## Use Cases

- **Random Access**: Ideal for scenarios where frequent access to elements by index is necessary, providing constant time positional access.
- **Dynamic Collections**: Widely used in applications that require the collection to grow dynamically, maintaining an ordered sequence of elements that can be accessed efficiently.
- **Data Manipulation**: Excellent for use cases involving frequent reading and less frequent resizing, such as in data analysis or UI element rendering.

---
---
---
