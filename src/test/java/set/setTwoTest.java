package set;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by savannah on 11/10/14.
 */

public class setTwoTest {
    setTwo set;

    @Before
    public void makesSets() {
        set = new setTwo();
    }

    @Test
    public void sizeGivesSizeOfTheArray() {
        assertEquals(set.size(), 0);

        set.add(1);

        assertEquals(set.size(), 1);

        set.add(2);

        assertEquals(set.size(), 2);
    }

    @Test
    public void canAddItemsToTheSet() {
        assertEquals(true, set.add(1));

        assertEquals(false, set.add(1));

        assertEquals(true, set.add(2));
    }

    @Test
    public void canAskIfSetIsEmpty() {
        assertEquals(true, set.isEmpty());

        set.add(1);

        assertEquals(false, set.isEmpty());
    }

    @Test
    public void setTellsIfItContainsAnItem() {
        assertEquals(false, set.contains(1));

        set.add(1);

        assertEquals(true, set.contains(1));

        assertEquals(false, set.contains(2));

        set.add(2);

        assertEquals(true, set.contains(2));

        assertEquals(true, set.contains(1));
    }

    @Test
    public void removesItemsFromTheSet() {
        assertFalse(set.remove(1));

        set.add(1);

        set.add(2);

        assertEquals(true, set.remove(1));

        assertEquals(set.size(), 1);

        assertEquals(set.contains(2), true);
    }
}
