package com.yakushkin.repetition.lesson_19_6_Collection_Iterator_Practic;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        MyList<String> strings = new MyList<>(10);
        strings.add("string1");
        strings.add("string2");
        strings.add("string3");
        strings.add("string4");

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("=====================");

        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println("=====================");

        strings.forEach(System.out::println);
    }
}
