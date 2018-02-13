package itis.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntArrayCollection implements Collection<Integer> {
    private int CAPACITY = 100;
    private int [] arr = new int[CAPACITY];
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
            for (Integer x: arr) {
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
        return null;
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean pr = false;
        for (Integer i: c) {
            pr = this.add(i) || pr;
        }
        return pr;
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
