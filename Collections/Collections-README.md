# Collections

Collections are data structures that group multiple elements into a single unit. They are used to store, retrieve, manipulate, and communicate aggregate data.

`Data aggregation - The process of organizing large amounts of data into a more consumable format.`

## Table of Contents

- [Lists](#lists)
  - Array Lists
    - [ArrayLists README](Lists/ArrayLists/ArrayLists-README.md)
    - [ArrayList Example](Lists/ArrayLists/ArrayListExample.java)
  - Linked Lists
    - [LinkedLists README](Lists/LinkedLists/LinkedLists-README.md)
    - [LinkedList Example](Lists/LinkedLists/LinkedListExample.java)
- [Queues](#queues)
  - Array Deques
    - [ArrayDeques README](Queues/ArrayDeques/ArrayDeques-README.md)
    - [ArrayDeque Example](Queues/ArrayDeques/ArrayDequeExample.java)
  - Priority Queues
    - [PriorityQueue README](Queues/PriorityQueue/PriorityQueue-README.md)
    - [PriorityQueue Example](Queues/PriorityQueue/PriorityQueueExample.java)
  - Stacks
    - [Stacks README](Queues/Stacks/Stacks-README.md)
    - [Stack Example](Queues/Stacks/StackExample.java)
- [Sets](#sets)
  - Hash Sets
    - [HashSets README](Sets/HashSets/HashSets-README.md)
    - [HashSet Example](Sets/HashSets/HashSetExample.java)

---

## Lists

Lists in Java allow for ordered storage and sequential access to elements, supporting both dynamic arrays and linked list implementations.

## Queues

Queues in Java support the typical FIFO (first-in, first-out) or priority-based ordering for processing elements, with specific classes providing various implementations.

## Sets

Sets in Java are used to store unique elements, preventing duplicates and providing efficient access and retrieval.

## Key Distinctions

- **Lists**: Can dynamically grow and allow position-specific access. `ArrayLists` are better for random access and `LinkedLists` for inserting or removing at the ends.
- **Queues**: Designed to handle elements before processing. `PriorityQueue` organizes elements according to given priorities, whereas `ArrayDeques` and `Stacks` support rapid push and pop operations.
- **Sets**: Primarily concerned with the uniqueness of elements, `HashSets` use hashing to store items, making add, remove, and contains operations efficiently constant time.

## Use Cases

- **Lists** are ideal for applications that require dynamic resizing and efficient random access or where the order of insertion is important.
- **Queues** are suitable for scenarios like job scheduling, where tasks are handled in an orderly fashion depending on their priorities or in typical first-come, first-served manners.
- **Sets** are favored in situations where it is crucial to maintain unique data entries and perform quick checks for item existence.

## Further Reading

- Explore the details about different list implementations in [Lists README](./Lists/Lists-README.md).
- Learn more about queue types and their use cases in [Queues README](./Queues/Queues-README.md).
- Discover how sets can enhance data handling in [Sets README](./Sets/Sets-README.md).

---
---
---
