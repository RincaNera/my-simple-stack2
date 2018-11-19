package deqo.ysan.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * A simple stack.
 */
public class SimpleStack implements Stack {
    /**
     * The stack of the items as a list.
     */
    List<Item> items;

    /**
     * Build a new stack.
     */
    SimpleStack() {
        items = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty.
     * @return true is the stack is empty.
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return items.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed
     *
     * @param item item to be pushed.
     */
    public void push(Item item) {
        items.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return Item on top of this stack.
     * @throws EmptyStackException If the stack contains no item.
     */
    public Item peek() throws EmptyStackException {
        if (items.size() == 0)
            throw new EmptyStackException();
        return items.get(items.size()-1);
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return Item on top of this stack.
     * @throws EmptyStackException Is the stack contains no item.
     */
    public Item pop() throws EmptyStackException {
        if (items.size() == 0)
            throw new EmptyStackException();
        Item item = items.get(items.size()-1);
        items.remove(items.size()-1);
        return item; }
}
