package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!super.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object element) {
        boolean removed = super.remove(element);
        if (removed) {
            this.sort();
        }
        return removed;
    }
}

