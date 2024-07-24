# Lists in Java

## Overview

Java's Collections Framework includes several implementations of the `List` interface, each offering different performance characteristics and features. This section focuses on `ArrayList` and `LinkedList`, which are two of the most widely used list implementations.

## Key Distinctions

- **ArrayList**:
  - Implements `List` using a dynamically resizable array.
  - Provides rapid random access and efficient positional access.
  - Modifications near the end of the list are efficient, but can be slow in the middle or start due to the need to shift elements.

- **LinkedList**:
  - Implements both `List` and `Deque` interfaces.
  - Uses a doubly-linked list structure, providing excellent performance for operations at the start or end.
  - Eliminates the need for element shifting, making it ideal for frequent additions and removals.

## Use Cases

- **ArrayList**:
  - Best suited for scenarios where frequent access to elements is required, offering efficient indexing capabilities.

- **LinkedList**:
  - Preferred for applications requiring intensive operations at both ends of the list, such as queue implementations or as stack data structures.

## Further Reading

- For detailed exploration of `ArrayList`, refer to:
  - [ArrayList README](./Lists/ArrayLists/README.md)
  - [ArrayList Example](./Lists/ArrayLists/ArrayListExample.java).

- For specifics on `LinkedList`, visit:
  - [LinkedList README](./Lists/LinkedLists/README.md)
  - [LinkedList Example](./Lists/LinkedLists/LinkedListExample.java).