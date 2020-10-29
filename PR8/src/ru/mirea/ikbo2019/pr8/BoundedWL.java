package ru.mirea.ikbo2019.pr8;

public class BoundedWL<E> extends WaitList<E> {
    private int capacity = 0;

    public BoundedWL(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() < capacity)
            content.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}