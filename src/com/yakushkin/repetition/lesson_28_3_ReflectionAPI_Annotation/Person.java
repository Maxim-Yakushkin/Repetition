package com.yakushkin.repetition.lesson_28_3_ReflectionAPI_Annotation;

public abstract class Person {

    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
