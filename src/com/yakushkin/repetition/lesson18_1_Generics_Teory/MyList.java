package com.yakushkin.repetition.lesson18_1_Generics_Teory;

public class MyList<T> {

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
}
