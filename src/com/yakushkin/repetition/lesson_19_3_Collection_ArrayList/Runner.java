package com.yakushkin.repetition.lesson_19_3_Collection_ArrayList;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println(integers.get(5));
        System.out.println(integers.contains(40)); // false
    }
}
