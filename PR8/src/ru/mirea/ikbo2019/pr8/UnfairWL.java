package ru.mirea.ikbo2019.pr8;

import java.util.Collection;

public class UnfairWL<E> extends WaitList<E> implements IWL<E>{
    public UnfairWL() {
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.contains(element)) {
            content.remove(element);
            content.add(element);
        }
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}