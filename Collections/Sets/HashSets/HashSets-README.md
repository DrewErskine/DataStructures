# HashSet README

## Overview

`HashSet` in Java implements the `Set` interface, backed by a `HashMap`. It does not maintain any order; the iteration order will vary. This class allows one null element.

## Features

- **Constant-time Performance**: Offers O(1) performance for add, remove, and contains operations, assuming proper hash distribution.
- **Uniqueness**: No duplicate elements are allowed.
- **Null Element**: Supports at most one null element.

---

## Key Operations

### 1. Initialization

- Default initialization:
  ```java
  Set<String> set = new HashSet<>();
  ```

- Initialization with custom capacity and load factor:
  ```java
  Set<String> set = new HashSet<>(initialCapacity, loadFactor);
  ```

### 2. Adding Elements

- Add an element:
  ```java
  set.add("Apple");  // Returns true if successfully added
  ```

### 3. Removing Elements

- Remove an element:
  ```java
  set.remove("Apple");  // Returns true if the element was successfully removed
  ```

### 4. Accessing Elements

- Check presence of an element:
  ```java
  boolean isPresent = set.contains("Apple");
  ```

### 5. Check Size and Emptiness

_Check the size of the map and whether it is empty:_

```java
int size = set.size();
```
```java
boolean isEmpty = set.isEmpty();
```

### 6. Clearing the HashSet

_Clear all entries from the `HashSet`:_

```java
set.clear();
```

### 7. Iterating Over HashSet

_Iterate through elements:_

```java
for (String item : set) {
    System.out.println(item);
}
```

---

## Use Cases

- **Ensuring Uniqueness**: Perfect for removing duplicates from collections.
- **Performance Critical Tasks**: Used in scenarios where quick lookup, addition, and deletion are necessary.

---

---

---