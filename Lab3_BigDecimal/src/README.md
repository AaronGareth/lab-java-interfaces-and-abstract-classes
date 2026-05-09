# Java Lab – README

## IntList Implementations: When to Use Each

### `IntArrayList` (grows by 50%)

**Use when:** You're working with a list that grows **slowly or predictably** and memory efficiency matters.

**Example scenario:**  
You're storing the IDs of active support tickets in a small customer service app. You start with a few tickets and rarely exceed 20–30 at a time. Because `IntArrayList` only grows by 50% at a time, it wastes less memory — an array that hits capacity at 10 grows to 15, not 20. Over many small lists, this adds up to meaningful memory savings.

**Trade-off:** More frequent resizes if the list grows quickly, which means more array-copy operations.

---

### `IntVector` (doubles in size)

**Use when:** You expect **rapid or large-scale growth** and performance is more important than memory.

**Example scenario:**  
You're collecting real-time sensor readings from an IoT device — thousands of integers arriving per second. Because `IntVector` doubles its capacity on each resize (e.g., 20 → 40 → 80 → 160), it resizes far less often than `IntArrayList`. Fewer resizes means fewer expensive copy operations, so the list keeps up with the high-volume input without slowing down.

**Trade-off:** May allocate more memory than is currently needed, since the array can be up to twice the size of the actual data.

---

## Summary Table

| Feature               | `IntArrayList`      | `IntVector`          |
|-----------------------|---------------------|----------------------|
| Default size          | 10                  | 20                   |
| Growth strategy       | +50% on resize      | ×2 on resize         |
| Memory efficiency     | ✅ Better            | ❌ Can waste space    |
| Speed (many inserts)  | ❌ More resizes      | ✅ Fewer resizes      |
| Best for              | Small/slow-growing  | Large/fast-growing   |
