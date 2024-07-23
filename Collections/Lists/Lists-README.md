# Lists in Java

## Overview

Java's Collections Framework includes several implementations of the `List` interface, each offering different performance characteristics and features. This section focuses on `ArrayList` and `LinkedList`, which are two of the most widely used list implementations.

## Key Distinctions

- **ArrayList**: Implements `List` with a dynamically resizable array, providing rapid random access and efficient positional access and modifications near the end of the list. However, it can be slow for manipulations in the middle or start of the list due to the need to shift elements.

- **LinkedList**: Implements both `List` and `Deque` interfaces. It provides great performance for adding and removing elements from the start or end of the list, as it uses a doubly-linked list structure that eliminates the need for element shifting.

## Use Cases

- **ArrayList** is typically used in scenarios where frequent access to list elements is required, as it provides efficient indexing capabilities.
- **LinkedList** is preferred for applications requiring intensive operations at both ends of the list, such as in queue implementations or stack data structures.

## Further Reading

- For a more detailed exploration of `ArrayList`, see the [ArrayList README](./Lists/ArrayLists/README.md) and [ArrayList Example](./Lists/ArrayLists/ArrayListExample.java).
- For `LinkedList` specifics, visit the [LinkedList README](./Lists/LinkedLists/README.md) and view the [LinkedList Example](./Lists/LinkedLists/LinkedListExample.java).