package itis.collections;

import java.util.Iterator;

public class ArrayIntIterator implements Iterator<Integer> {
    private Integer [] arr;
    private int length;
    private int cursor = 0;

    public ArrayIntIterator(Integer [] arr, int length) {
        this.arr = arr;
        this.length = length;
        cursor = 0;
    }
    public boolean hasNext() {
        return cursor < length;
    }

    @Override
    public Integer next() {
        return arr[cursor++];
    }

    public static void main(String[] args) {


    }
}
