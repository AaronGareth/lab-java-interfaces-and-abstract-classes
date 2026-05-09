/**
 * An IntList implementation backed by an array that starts at size 20
 * and doubles in size whenever capacity is reached.
 *
 * Best used when: you expect a large or rapidly growing number of insertions.
 * Doubling the array less frequently means fewer expensive copy operations
 * at the cost of potentially using more memory.
 */
public class IntVector implements IntList {

    // Default starting capacity
    private static final int DEFAULT_CAPACITY = 20;

    private int[] data;  // Internal storage array
    private int size;    // Number of elements currently stored

    /**
     * Constructs an IntVector with a default capacity of 20.
     */
    public static void main(String[] args) {
        IntVector vector = new IntVector();

        // Add 22 elements to trigger a resize (default capacity is 20)
        for (int i = 1; i <= 22; i++) {
            vector.add(i * 5);
        }

        System.out.print("Elements: ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println("\nSize: " + vector.size());
    }

    public IntVector() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Adds a new integer to the list.
     * If the array is full, it is doubled in size before adding the new element.
     *
     * @param number the integer to add
     */
    @Override
    public void add(int number) {
        // Check if we need to double capacity before adding
        if (size == data.length) {
            resize();
        }
        data[size] = number;
        size++;
    }

    /**
     * Retrieves the element at the given index.
     *
     * @param id the zero-based index
     * @return the integer stored at that index
     * @throws IndexOutOfBoundsException if id is out of range
     */
    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index " + id + " is out of bounds. Size: " + size);
        }
        return data[id];
    }

    /**
     * Doubles the internal array size to accommodate more elements.
     * All existing elements are copied to the new array.
     */
    private void resize() {
        // New capacity is exactly double the current length
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];

        // Copy all existing elements to the new array
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    /**
     * Returns the number of elements currently in the list.
     *
     * @return current element count
     */
    public int size() {
        return size;
    }
}
