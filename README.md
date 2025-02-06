# Abstract Data Types (ADT) Implementations in Java
### Overview

This repository contains implementations of fundamental Abstract Data Types (ADTs) in Java, including:
- Queue
- Stack
- Deque (Double-ended Queue)

Each ADT is implemented using both arrays (circular arrays when needed) and linked lists as underlying data structures to provide different trade-offs in terms of performance and memory usage.

| ADT | Implementation | Enqueu/Push | Dequeue/Pop | Space Complexity |
| --- | -------------- | ----------- | ----------- | ---------------- |
| Queue | Array | O(1) (if not full) | O(1) | O(n) |
| Queue | Linked List | O(1) | O(1) | O(n) |
| Stack | Array | O(1) (if not full) | O(1) | O(n) |
| Stack | Linked List | O(1) | O(1) | O(n) |
| Deque | Array | O(1) (if not full) | O(1) | O(n) |
| Deque | Linked List | O(1) | O(1) | O(n) |

*All operations occur in constant time (O(1)) except for array resizing.*
