package deqo.ysan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleItemTest {

    @Test
    public void testGetData() {
        // given: an Item of Integer equals to 1
        Item item = new SimpleItem<Integer>(1);
        // when: getting this value back
        Integer integer = (Integer) item.getData();
        // then: this Integer is equal to 1
        assertEquals(new Integer(1), integer);
    }

    @Test
    public void setData() {
        // given: an Item of Integer equals to 1
        Item item = new SimpleItem<Integer>(1);
        // when: setting its value to 2
        item.setData(new Integer(2));
        // then: the value of the integer is 2
        assertEquals(new Integer(2), item.getData());
    }
}