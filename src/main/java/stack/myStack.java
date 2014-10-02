package stack;

import java.util.LinkedList;
import java.util.List;

public class myStack<E> {
    private List internalList;

    public boolean run() {
        return true;
    }

    public myStack() {
        internalList = new LinkedList<E>();
    }

    String view() {
        return internalList.toString();
    }


}
