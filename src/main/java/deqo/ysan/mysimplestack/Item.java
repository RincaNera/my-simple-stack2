package deqo.ysan.mysimplestack;

/**
 * An Item.
 * @param <T>
 */
public interface Item<T> {
    /**
     * Returns the value of this item.
     * @return The value of this item.
     */
    T getData();

    /**
     * Set the value of this item.
     * @param newValue The new value.
     */
    void setData(T newValue);
}
