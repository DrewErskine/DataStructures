# Queues in Java

## Overview

Queues in Java are part of the Collections Framework, designed to hold elements prior to processing. Different implementations are used depending on the needs for concurrency, order, or bounds.

## Implementations

- **ArrayDeque**:
  - Fast array-based implementation of the `Deque` interface.
  - Efficient at adding or removing elements from both ends.

- **LinkedBlockingQueue**:
  - Optionally-bounded blocking queue based on linked nodes.
  - Typically used in producer-consumer scenarios.

- **PriorityQueue**:
  - Queue based on priority heap, elements are ordered according to their natural ordering or by a provided comparator.

## Use Cases

- **ArrayDeque** is suitable for stacks and queues that do not require capacity restrictions.
- **LinkedBlockingQueue** is ideal for scenarios with multiple producers and consumers.
- **PriorityQueue** is used when processing order needs to respect element priority.

---

## Links

- For detailed exploration of `ArrayDequed`, refer to:
  - [ArrayDequed README](./Lists/ArrayDequeds/ArrayDequeds-README.md)
  - [ArrayDequed Example](./Lists/ArrayDequed/ArrayDequedExample.java).

- For specifics on `LinkedList`, visit:
  - [LinkedList README](./Lists/LinkedLists/README.md)
  - [LinkedList Example](./Lists/LinkedLists/LinkedListExample.java).