package deqo.ysan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {

    @Before
    public void setUp() {
        stack = new SimpleStack();
    }

    @Test
    public void testIsEmptyOnEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyOnNotEmptyStack() {
        stack.push(new SimpleItem<>(5));
        assertTrue(!stack.isEmpty());
    }

    @Test
    public void testGetSizeOnEmptyStack() {
        assertNotEquals(1, stack.getSize());
    }

    @Test
    public void testGetSizeOnNotEmptyStack() {
        stack.push(new SimpleItem<>(5));
        assertNotEquals(0, stack.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekOnEmptyStack() {
        stack.peek();
    }

    @Test
    public void testPeekOnNotEmptyStack() {
        // given: un item de type Item
        Item unItem = new SimpleItem<>(5);
        // when: this item is added in the stack
        stack.push(unItem);
        // then: this stack actually contains this item
        assertSame(unItem, stack.peek());
        // then: this size of the stack doesn't change
        assertEquals(1, stack.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void testPopOnEmptyStack() {
        stack.pop();
    }

    @Test
    public void testPopOnNotEmptyStack() {
        stack.push(new SimpleItem<>(5));
        stack.pop();
        assertNotEquals(1, stack.getSize());
    }

    @Test
    public void testPush() {
        stack.push(new SimpleItem<>(5));
        assertNotEquals(0, stack.getSize());
    }

    private Stack stack;
}