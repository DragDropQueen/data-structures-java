package set;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by savannah on 11/10/14.
 */
public class mijiSetTest {
    mijiSet set;

    @Before
    public void makesOurSet() {
        set = new mijiSet();
    }

    @Test
    public void tellsIfSetIsEmpty() {

        assertEquals(set.isEmpty(), true);

        set.add(1);

        assertEquals(set.isEmpty(), false);
    }

    @Test
    public void tellsTheSizeOfTheSet() {

        set.add(1);

        assertEquals(set.size(), 1);
    }

    @Test
    public void tellsIfContainsAnItem() {

        set.add(1);

        assertEquals(set.contains(1), true);

        assertEquals(set.contains(2), false);

        set.add(2);

        assertEquals(set.contains(1), true);

        assertEquals(set.contains(2), true);
    }

    @Test
    public void cantAddDuplicateItemsToASet() {

        assertTrue(set.add(1));

        assertFalse(set.add(1));

        assertEquals(set.size(), 1);
    }

    @Test
    public void canRemoveItemsFromOurSet() {

        set.add(1);

        assertEquals(true, set.remove(1));

        assertEquals(set.size(), 0);

        set.add(2);

        assertEquals(false, set.remove(1));

        assertEquals(set.size(), 1);

        assertEquals(set.contains(1), false);
    }

    @Test
    public void canAddManyItemsToTheSet() {
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals(true, set.add(4));

        assertEquals(set.size(), 4);
    }
}


