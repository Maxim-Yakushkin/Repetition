package com.yakushkin.repetition.lesson_19_5_Collection_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> arrayList = new ArrayList<>(list);

        Iterator<Integer> listIterator = list.iterator();
        Iterator<Integer> arrayListIterator = arrayList.iterator();

        while (arrayListIterator.hasNext()) {
            Integer next = arrayListIterator.next();
            if (next == 3 || next == 4) {
                arrayListIterator.remove();
            }
        }

        arrayList.removeIf(next -> next == 3 || next == 4); // альтернатива циклу с итератором выше, с помощью лямбда-выражения

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

        System.out.println("--------------------------------------");

        while (listIterator.hasNext()) {
            Integer next = listIterator.next();
            System.out.println(next);
        }

    }
}
