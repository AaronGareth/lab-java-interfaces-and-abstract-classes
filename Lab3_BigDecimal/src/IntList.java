/**
 * Interface defining a basic list of integers.
 * Implementations handle their own internal storage and resizing strategies.
 */
public interface IntList {

    /**
     * Adds a new integer to the list.
     *
     * @param number the integer to add
     */
    void add(int number);

    /**
     * Retrieves an element by its index (ID).
     *
     * @param id the zero-based index of the element
     * @return the integer at the specified index
     */
    int get(int id);
}
