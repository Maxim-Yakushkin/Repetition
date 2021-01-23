package com.yakushkin.repetition.lesson_19_8_Collection_HashMap_Theory;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.id, ivan);
        map.put(petr.id, petr);

        System.out.println(map.get(1));

        System.out.println("=======================");

        for (Integer id : map.keySet()) {
            System.out.println(map.get(id));
        }
    }
}
