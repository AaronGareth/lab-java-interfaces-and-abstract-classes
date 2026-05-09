/**
 * An IntList implementation backed by an array that starts at size 10
 * and grows by 50% whenever capacity is reached.
 *
 * Best used when: you expect a relatively small or predictable number of
 * insertions and want to conserve memory. The 50% growth minimizes wasted
 * space compared to doubling.
 */
public class IntArrayList implements IntList {

    // Default starting capacity
    private static final int DEFAULT_CAPACITY = 10;

    private int[] data;   // Internal storage array
    private int size;     // Number of elements currently stored

    /**
     * Constructs an IntArrayList with a default capacity of 10.
     */
    public static void main(String[] args) {
        IntArrayList list = new IntArrayList();

        // Add 12 elements to trigger a resize (default capacity is 10)
        for (int i = 1; i <= 12; i++) {
            list.add(i * 10);
        }

        System.out.print("Elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\nSize: " + list.size());
    }

    public IntArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Adds a new integer to the list.
     * If the array is full, it is resized to 150% of its current length
     * before adding the new element.
     *
     * @param number the integer to add
     */
    @Override
    public void add(int number) {
        // Check if we need to resize before adding
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
     * Grows the internal array by 50% to accommodate more elements.
     * All existing elements are copied to the new array.
     */
    private void resize() {
        // Calculate new capacity: current length + 50%
        int newCapacity = data.length + (data.length / 2);
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
