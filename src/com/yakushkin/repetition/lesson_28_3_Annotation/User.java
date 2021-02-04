package com.yakushkin.repetition.lesson_28_3_Annotation;

import java.io.Serializable;

public class User extends Person implements Serializable, Comparable<User> {

    private String name;
    @MinAge(age = 21)
    private int minAge;

    public User(int id, String name, int minAge) {
        super(id);
        this.name = name;
        this.minAge = minAge;
    }

    public User(int id, String name) throws NoSuchFieldException {
        super(id);
        this.name = name;
        this.minAge = User.class.getDeclaredField("minAge").getAnnotation(MinAge.class).age();
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", minAge=" + minAge +
                '}';
    }
}
