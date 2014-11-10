package set;

/**
 * Created by savannah on 11/10/14.
 */
public class setTwo {
    int[] array = new int[0];

    public boolean add(int item) {
        if (contains(item)) {
            return false;
        }

        int[] newArray = new int[size() + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

        array[size() - 1] = item;

        return true;
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(int item) {
        boolean contains = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] ==  item) {
                contains = true;
            }
        }
        return contains;
    }

    public boolean remove(int item) {
        int offset = 0;

        if (!contains(item)) {
            return false;
        }

        int[] newArray = new int[size() - 1];

        for (int i = 0; i < size(); i++) {
            if (array[i] == item) {
                offset++;
            } else {
                newArray[i - offset] = array[i];
            }
        }

        array = newArray;
        return true;
    }
}
