package itis.collections;

import java.util.Collection;

public abstract class AbstractCollection implements Collection<Integer> {
    @Override
    public boolean containsAll(Collection<?> coll) {
        for (Object o : coll) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean pr = false;
        for (Integer i : c) {
            pr = this.add(i) || pr;
        }
        return pr;
    }


}
