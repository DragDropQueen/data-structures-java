package set;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class mySetTest {
    mySet set;

    @Before
    public void MySet() {
        set = new mySet();
    }

    @Test
    public void AddAddsItemsToMySet() {
        assertTrue(set.add(1));
    }

    @Test
    public void IsEmptyTellsIfSetIsEmpty() {
        assertTrue(set.isEmpty());

        set.add(1);

        assertEquals(false, set.isEmpty());
    }

    @Test
    public void SizeTellsTheNumberOfItemsInTheSet() {
        assertEquals(0, set.size());

        set.add(1);

        assertEquals(1, set.size());

        set.add(2);

        assertEquals(2, set.size());
    }

    @Test
    public void ContainsTellsIfSetAlreadyHasAnItem() {
        assertFalse(set.contains(1));

        set.add(1);

        assertEquals(true, set.contains(1));
    }

    @Test
    public void CannotAddDuplicateItemsToTheSet() {
        assertTrue(set.add(1));

        assertEquals(false, set.add(1));

        assertEquals(set.size(), 1);
    }

    @Test
    public void CanRemoveItemsFromTheSet() {
        set.add(1);
        set.add(2);

        assertEquals(true, set.remove(1));

        assertEquals(set.size(), 1);

        assertEquals(set.contains(1), false);
    }
}
