package com.yakushkin.repetition.lesson_21_1_Lambda;

import java.util.Comparator;

public class Run {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(25, 100));
    }

//    private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        // [модификаторы] возвращаемый тип название([параметры])
//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
//    }
}
