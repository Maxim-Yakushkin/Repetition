package com.yakushkin.repetition.lesson_19_6_Collection_Iterator_Practic;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public MyList(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T getElement(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
