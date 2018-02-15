package itis.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        IntArrayCollection iac = new IntArrayCollection();
        iac.add(100);
        iac.add(300);
        iac.add(12450);
        Iterator<Integer> i = iac.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
