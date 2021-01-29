package com.yakushkin.repetition.lesson_21_6_Stream_Practic;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPracticeRunner {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        additionalTask();
    }

    private static void additionalTask() {
        // Доп. задание: Пребразовать список Person в Map<Integer,List<Person> (age : List<Person>)
        List<Person> personList = List.of(
                new Person("Ivan", "Ivanov", 18),
                new Person("Petr", "Petrov", 24),
                new Person("Vasia", "Vasilevich", 17),
                new Person("Sveta", "Svetikova", 18),
                new Person("Katya", "Katyikova", 31),
                new Person("Denis", "Denisovich", 26),
                new Person("Kira", "Kirovna", 26)
        );
        // 1. Получаем Map, где Person сгрупированы по возрасту
        Map<Integer, List<String>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::fullName, Collectors.toList())));
        System.out.println(map);

        // 2. Получаем Map, где ключ - возраст, значение fullName. (Будет ошибка, если возрасты совпадают)
        Map<Integer, String> map1 = personList.stream()
                .collect(Collectors.toMap(Person::getAge, Person::fullName));
        System.out.println(map1);
    }

    private static void task5() {
        // 5. Дан класс Person с полями firstName, lastName, age.
        // Вывести полное имя самого старшего человека,
        // у которого длина этого имени не превышает 15 символов.
        List<Person> personList = List.of(
                new Person("Ivan", "Ivanov", 18),
                new Person("Petr", "Petrov", 24),
                new Person("Vasia", "Vasilevich", 17),
                new Person("Sveta", "Svetikova", 28),
                new Person("Katya", "Katyikova", 31),
                new Person("Denis", "Denisovich", 26),
                new Person("Kira", "Kirovna", 26)
        );
        personList.stream()
                .filter(person -> person.fullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::fullName)
                .ifPresent(System.out::println);
    }

    private static void task4() {
        // 4. Дан список целых чисел, вывести строку,
        // представляющую собой конкатенацию
        // строковых представлений этих чисел.
        // Пример: список {5, 2, 4, 2, 1}
        // Результирующая строка: "52421"
        List<Integer> integers = List.of(5, 2, 4, 2, 1);

        Optional<String> intToString1 = integers.stream()
                .map(x -> Integer.toString(x))
                .reduce((x, y) -> x + y);
        intToString1.ifPresent(System.out::println);

        String intToString2 = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(intToString2);

        String intToString3 = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "Prefix", "suffix"));
        System.out.println(intToString3);

    }

    private static void task3() {
        // 3. Дана Map<String, Integer>. Найти сумму всех
        // значений, длина ключей которых меньше 7
        // символов.
        Map<String, Integer> map = Map.of(
                "1234", 1,
                "12345", 5,
                "12345678", 7,
                "123456", 2,
                "123456789", 9
        );
        long sum = map.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .summaryStatistics()
                .getSum();
        System.out.println(sum);
    }

    private static void task2() {
        // 2. Дан список строк. Найти количество уникальных
        // строк длиной более 8 символов.
        List<String> stringList = List.of("123456", "123456", "123456789", "123", "1234", "12345678910", "123456789");
        int countUniqueStrings1 = stringList.stream()
                .filter(str -> str.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(countUniqueStrings1);

        long countUniqueStrings2 = stringList.stream()
                .filter(str -> str.length() > 8)
                .distinct() // убирает все дубликаты. Не создает новую коллекцию -> оптимальнее по памяти
                .count();
        System.out.println(countUniqueStrings2);
    }

    private static void task1() {
        // 1. Дан список целых чисел. Найти среднее всех
        // нечётных чисел, делящихся на 5.
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 32, 45);
        OptionalDouble average = integerList.stream()
                .filter(x -> x % 2 != 0)
                .filter(x -> x % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        average.ifPresent(System.out::println);
    }
}
