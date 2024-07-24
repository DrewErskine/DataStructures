# Maps

Maps are data structures that store key-value pairs. They provide an efficient way to retrieve, update, and manage data through unique keys.

## Table of Contents

- [ConcurrentHashMaps](ConcurrentHashMaps/ConcurrentHashMaps-README.md)
- [HashMaps](HashMaps/HashMaps-README.md)
- [LinkedHashMaps](LinkedHashMaps/LinkedHashMaps-README.md)
- [TreeMaps](TreeMaps/TreeMaps-README.md)

---

## ConcurrentHashMaps

ConcurrentHashMaps are designed for concurrent use by multiple threads without the need for external synchronization.

- [Learn about ConcurrentHashMaps](ConcurrentHashMaps/ConcurrentHashMaps-README.md)
- [ConcurrentHashMap Example](ConcurrentHashMaps/ConcurrentHashMapExample.java)

## HashMaps

HashMaps provide constant-time performance for the basic operations (get and put), assuming the hash function disperses elements properly.

- [Learn about HashMaps](HashMaps/HashMaps-README.md)
- [HashMap Example](HashMaps/HashMapExample.java)

## LinkedHashMaps

LinkedHashMaps maintain the insertion order of entries, making it suitable for caching applications where order matters.

- [Learn about LinkedHashMaps](LinkedHashMaps/LinkedHashMaps-README.md)
- [LinkedHashMap Example](LinkedHashMaps/LinkedHashMapExample.java)

## TreeMaps

TreeMaps maintain a sorted map according to the natural ordering of its keys, or by a comparator provided at map creation, ideal for applications that depend on ordered data.

- [Learn about TreeMaps](TreeMaps/TreeMaps-README.md)

---

## Key Distinctions

- **HashMap**: Provides the general contract of the `Map` interface with expected constant-time performance for `put` and `get` operations. It does not maintain any order of its keys.

- **LinkedHashMap**: Extends `HashMap` and maintains a doubly-linked list through all of its entries. This linked list defines the iteration ordering, which is normally the order in which keys were inserted into the map (`insertion-ordered`).

- **TreeMap**: Implements a red-black tree that guarantees that the map will be in ascending key order, depending on the natural ordering or by a comparator provided at map creation.

- **ConcurrentHashMap**: Similar to `HashMap` but with thread-safe concurrency features. It does not lock the whole map, but instead, locks portions of the map to allow concurrent readers and limited number of writers.

---

## Use Cases

- **HashMap** is suitable for applications needing rapid access and storage where key order is not important.
- **LinkedHashMap** is ideal for cache implementations where the order of entries is crucial for the eviction mechanism.
- **TreeMap** is preferred for applications that require ordered traversal of keys or need a map that is sorted by default.
- **ConcurrentHashMap** is used in multi-threaded applications to prevent thread interference and memory consistency errors.

---
---
---
