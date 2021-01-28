package com.yakushkin.repetition.lesson_21_5_Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    // Из n студентов найти студента с максимальным возратсом

    /**
     * разбиваем на n-груп и будем паралленльно искать нужную информацию
     * <p>
     * [1_000_000] -> age -> max age
     * <p>
     * [1_000_000] -> age -> max age -> max!
     * <p>
     * [1_000_000] -> age -> max age
     */
    public static void main(String[] args) {
        // Optional этот как Stream, но только с одним объектом, а не со множеством
        Optional<Student> optionalStudent = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasia"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Denis"),
                new Student(101, "Kira")
        )
                .sequential()
//                .flatMap(student -> student.getMarks().stream())
//                .map(mark -> ...)
                .filter(student -> student.getAge() < 50)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        optionalStudent.ifPresent(System.out::println);

        optionalStudent.map(Student::getAge)
                .filter(age -> age > 18)
                .ifPresent(System.out::println);
    }
}
