package deqo.ysan.mysimplestack;

/**
 * A simple item.
 * @param <T>
 */
public class SimpleItem<T> implements Item<T> {
    /**
     * The value of this item.
     */
    protected T value;
    /**
     * Returns the value of this item.
     * @return The value of this item.
     */
    public T getData() {
        return value;
    }

    /**
     * Set the value of this item.
     * @param newValue The new value.
     */
    public void setData(final T newValue) {
        value = newValue;
    }

    /**
     * Build an item with a default value.
     * @param defaultValue The default value.
     */
    SimpleItem(final T defaultValue) {
        value = defaultValue;
    }
}
