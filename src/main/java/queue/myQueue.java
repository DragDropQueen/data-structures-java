package queue;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class myQueue<E> extends AbstractQueue<E>{
    private List<E> internalArray;

    public boolean run() {
        return true;
    }

    public myQueue() {
        internalArray = new LinkedList<E>();
    }

    public boolean enqueue(E e) {
        return internalArray.add(e);
    }

    public String view() {
        return internalArray.toString();
    }

    public Object dequeue() {
        return internalArray.toArray()[0];
    }

    public E poll() {
        return null;
    }

    public boolean offer(E e) {
        return false;
    }

    public Iterator<E> iterator() {
      return null;
    }

    public E peek() {
        return null;
    }

    public int size() {
        return 0;
    }
}
