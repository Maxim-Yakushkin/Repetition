package com.yakushkin.repetition.lesson_23_1_Serialize_Deserialize;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    public String name;
    public String lastName;
//    public transient String lastName; // transient говорит о том, что это поле сериализовать НЕ нужно
    public int age;

    public Person(String name, String lastName,int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
