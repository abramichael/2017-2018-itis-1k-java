package itis.collections;

import java.util.Collection;
import java.util.Iterator;

public class IntLinkedCollection implements Collection<Integer>  {

    private class Elem {
        Integer value;
        Elem next;
    }

    private Elem head;
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
            Elem p = head;
            while (p != null) {
                if (p.value == i) {
                    return true;
                }
                p = p.next;
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
        Elem p = new Elem();
        p.value = i;
        p.next = head;
        head = p;
        n++;
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
