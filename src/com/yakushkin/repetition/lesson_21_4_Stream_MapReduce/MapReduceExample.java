package com.yakushkin.repetition.lesson_21_4_Stream_MapReduce;

import java.util.stream.Stream;

public class MapReduceExample {

    // Из 3-х миллионов студентов найти студента с максимальным возратсом

    /**
     * разбиваем на 3 группы и будем паралленльно искать в 3-х группах
     * <p>
     * [1_000_000] -> age -> max age
     * <p>
     * [1_000_000] -> age -> max age -> max!
     * <p>
     * [1_000_000] -> age -> max age
     */
    public static void main(String[] args) {
        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasia"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Denis"),
                new Student(101, "Kira")
        )
                .parallel() // распараллеливаем выполение расчетов
//                .sequential() // целенаправленно используем 1 поток
                .map(Student::getAge)
//                .reduce(Math::max)
//                .reduce(Math::min)
                .reduce(Integer::sum)       //сумма всех возрастов
                .ifPresent(System.out::println);
    }
}
