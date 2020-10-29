package ru.mirea.ikbo2019.pr8;

import java.util.Collection;

public interface IWL<E> {
    public void add(E element);
    public boolean contains(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}