# README for LinkedList in Java

## Overview

`LinkedList` in Java is an implementation of both the `List` and `Deque` interfaces. It allows for efficient insertion and deletion of elements from both ends of the list, making it suitable for applications where frequent additions and deletions are required.

## Features

- **Dual Implementation:** Implements `List` and `Deque` interfaces.
- **Efficiency:** Offers better performance than `ArrayList` for frequently added/removed elements.
- **Element Access:** Allows for insertion and deletion of the first and/or last element of the list.

---

## Key Operations

1. **Initialization**
   - LinkedList<String> list = new LinkedList<>();

2. **Adding Elements**
   - list.add("Apple"); // Adds to the end of the list
   - list.addFirst("Banana"); // Adds to the front of the list
   - list.add(1, "Cherry"); // Adds Cherry at the second position

3. **Accessing Elements**
   - String firstFruit = list.getFirst(); // Retrieves the first element
   - String lastFruit = list.getLast(); // Retrieves the last element
   - String fruit = list.get(0); // Retrieves the first element (indexed from 0)

4. **Removing Elements**
   - list.removeFirst(); // Removes the first element
   - list.removeLast(); // Removes the last element
   - list.remove(1); // Removes the element at index 1

5. **Iterating Through LinkedList**
   - for(String fruit : list) {
       System.out.println(fruit);
     }

6. **Check Size of List**
   - int size = list.size(); // Returns the number of elements in the list

7. **Check if List is Empty**
   - boolean isEmpty = list.isEmpty(); // Returns true if the list is empty

8. **Clear List**
   - list.clear(); // Removes all elements from the list

9. **Special LinkedList Operations**
   - list.addLast("Strawberry"); // Adds to the end of the list
   - String peek = list.peekFirst(); // Peeks at the first element without removing
   - String polled = list.pollFirst(); // Retrieves and removes the first element
   - String peekLast = list.peekLast(); // Peeks at the last element without removing
   - String pollLast = list.pollLast(); // Retrieves and removes the last element

---

## Use Cases

`LinkedList` is particularly useful for applications requiring frequent additions and removals of elements from both ends, such as in queue implementations or when implementing stacks or deque structures.
