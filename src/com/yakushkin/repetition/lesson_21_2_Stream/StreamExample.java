package com.yakushkin.repetition.lesson_21_2_Stream;

import java.util.Comparator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        strings.stream()
                .map(x -> x + x)
                .map(Integer::valueOf)
                .filter(x -> x % 2 == 0)
                .sorted((o1, o2) -> -o1.compareTo(o2)) // сортировка по убыванию
                .skip(1) // пропуститть первый элемент
                .forEach(System.out::println);

//        for (String string : strings) {
//            String value = string + string;
//            Integer integer = Integer.valueOf(value);
//            if (integer % 2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }
}
