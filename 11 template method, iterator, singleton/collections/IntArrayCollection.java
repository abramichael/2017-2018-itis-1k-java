package itis.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntArrayCollection extends AbstractCollection {
    private int CAPACITY = 100;
    private Integer[] arr = new Integer[CAPACITY];
    private int n = 0;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Integer) {
            Integer i = (Integer) o;
            for (Integer x : arr) {
                if (x == i) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIntIterator(arr, n);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer i) {
        arr[n] = i;
        n++;
        // ToDo: homework - do resize and test it
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
