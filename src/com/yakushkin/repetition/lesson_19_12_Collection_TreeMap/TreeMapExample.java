package com.yakushkin.repetition.lesson_19_12_Collection_TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikovna");
        Person vika = new Person(30, "Vika", "Vikovna");
        Person alla = new Person(45, "Alla", "Allovna");
        Person maxim = new Person(10, "Maxim", "Maximov");

        Map<Integer, Person> map = new TreeMap<>(); // в TreeMap сразу делается сортировка по ключу, но можно укказать компаратор
        map.put(ivan.id, ivan);
        map.put(petr.id, petr);
        map.put(sveta.id, sveta);
        map.put(vika.id, vika);
        map.put(alla.id, alla);
        map.put(maxim.id, maxim);

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue())); // forEach первый вариант
        System.out.println("===================================");
        map.forEach((key, value) -> System.out.printf("%d : %s %s\n", key, value.firstName, value.lastName)); // forEach второй вариант (более правильный)
    }
}
