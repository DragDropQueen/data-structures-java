package set;

/**
 * Created by savannah on 11/9/14.
 */
public class mySet {
    int[] array = new int[10];
    int count = 0;

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean add(int item) {
        if (contains(item)) {
            return false;
        }
        count++;
        array[count] = item;
        return true;
    }

    public int size() {
        return count;
    }

    public boolean contains(int item) {
        boolean contains = false;

        for (int i = 0; i <= count; i++) {
            if (array[i] == item) {
                contains = true;
            }
        }

        return contains;
    }

    public boolean remove(int item) {
        boolean removed = false;

        for (int i = 0; i <= count; i++) {
            if (array[i] == item) {
                array[i] = array[count];
                count--;
                removed = true;
            }
        }

        return removed;
    }

    public mySet retainAll() {
        return new mySet();
    }

    public mySet addAll() {
        return new mySet();
    }

    public void iterate() {

    }
}
