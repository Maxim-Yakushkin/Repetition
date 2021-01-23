package com.yakushkin.repetition.lesson_19_10_Collection_LinkedHashMap_Practic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(22, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");

        Map<Integer, Person> map = new LinkedHashMap<>(); // связанный список. Т.е. все выводится будет в той же последовательности в которой все добавлялось
        map.put(ivan.id, ivan);
        map.put(petr.id, petr);
        map.put(sveta.id, sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
