package deqo.ysan.mysimplestack;

/**
 * An Item.
 */
public interface Item<T> {
    /**
     * Returns the value of this item.
     * @return The value of this item.
     */
    public T getData();

    /**
     * Set the value of this item.
     * @param newValue The new value.
     */
    public void setData(T newValue);
}
