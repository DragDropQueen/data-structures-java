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
}