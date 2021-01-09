package com.yakushkin.repetition.lesson_19_4_Collection_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.println(integers.get(5 - 1));
        System.out.println(integers.contains(20)); // false
    }
}
