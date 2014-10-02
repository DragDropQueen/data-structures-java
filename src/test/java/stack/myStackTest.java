package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class myStackTest {
    myStack<Integer> testStack;

    @Before
    public void MakeMyStack() {
        testStack = new myStack<>();
    }

    @Test
    public void MyStackCanBeInitialized() {
        assertTrue(testStack.run());
    }

    @Test
    public void MyStackCreatesAStack() {
        assertEquals("[]", testStack.view());
    }

    @Test
    public void MyStackCanAddItems() {
        assertTrue(testStack.push(1));

        assertEquals("[1]", testStack.view());
    }

    @Test
    public void MyStackStatesIfItIsEmpty() {
        assertTrue(testStack.isEmpty());

        testStack.push(2);

        assertFalse(testStack.isEmpty());
    }

    @Test
    public void MyStackReturnsItsSize() {
        assertEquals(0, testStack.size());

        testStack.push(2);
        assertEquals(1, testStack.size());
    }
}