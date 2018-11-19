package deqo.ysan.mysimplestack;

import java.util.EmptyStackException;

/**
 * A Stack.
 */
public interface Stack {
    /**
     * Tests if this stack is empty.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed
     * @param item item to be pushed.
     */
    public void push (Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return Item on top of this stack.
     * @throws EmptyStackException If the stack contains no item.
     */
    public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @return Item on top of this stack.
     * @throws EmptyStackException Is the stack contains no item.
     */
    public Item pop() throws EmptyStackException;
}
