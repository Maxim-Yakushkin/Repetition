package com.yakushkin.repetition.lesson_19_9_Collection_HashMap_Practic;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(2, "Sveta", "Svetikova"); // если ключи совпадают, то предыдущее значение в мапе перетирается новым!

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.id, ivan);
        map.put(petr.id, petr);
        map.put(sveta.id, sveta);
        map.putIfAbsent(petr.id, petr); // не ложит значение, если в мапе уже имеется значение с таким ключем

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Person person : map.values()) {
            System.out.println(person.firstName);
        }

        for (Integer integer : map.keySet()) {
            System.out.println(integer);
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(sveta));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(4, ivan));
    }
}
