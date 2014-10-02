package queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;


public class myQueueTest {
    myQueue<Integer> testQueue;

    @Before
    public void MakeMyQueueClass() {
        testQueue = new myQueue<Integer>();
    }

    @Test
    public void MyQueueCanBeInitialized() {
        assertTrue(testQueue.run());
    }

    @Test
    public void MyQueueConstructsAQueue() {
    }

    @Test
    public void MyQueueShouldAddItems() {
        assertEquals(true, testQueue.enqueue(1));
        assertEquals(true, testQueue.enqueue(2));
        assertEquals("[1, 2]", testQueue.view());
    }

    @Test
    public void MyQueueReturnsTheFirstItem() {
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        assertEquals(1, testQueue.dequeue());
        assertNotEquals(2, testQueue.dequeue());
    }
}