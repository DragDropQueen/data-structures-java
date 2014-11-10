package set;

/**
 * Created by savannah on 11/10/14.
 */
public class mijiSet {
    int[] array = new int[3];
    int count = 0;

    public boolean isEmpty() {
        if (size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean add(int item) {
        if (contains(item)) {
            return false;
        } else if (array.length == size()) {
            resize();
        }
        array[count] = item;
        count++;
        return true;
    }

    public int size() {
        return count;
    }

    public boolean contains(int item) {
        for (int i = 0; i < count; i++) {
            if (array[i] == item) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(int item) {
        for (int i = 0; i < count; i++) {
            if (array[i] == item) {
                array[i] = array[count - 1];
                count--;
                return true;
            }
        }

        return false;
    }

    public void resize() {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public void retainAll(mijiSet set) {

    }

    public void removeAll(mijiSet set) {

    }
}

