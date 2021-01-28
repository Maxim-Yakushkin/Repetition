package com.yakushkin.repetition.lesson_21_3_Stream_For_Primitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(x -> x + x)
                .map(Integer::valueOf)
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                // или
//                .boxed()
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::println) // по сути как и forEach, но не терминальная! Т.е. возвращает stream и можно продолжать дольше работать как с потоком
                .collect(Collectors.toList());
        System.out.println(collect);

        // тоже самое как создать цикл for от Х до У
        IntStream.range(0, 10)
                .forEach(System.out::println);

        // тоже самое как for от 0 до бесконечности и каждая итерация добавляет +3
        IntStream.iterate(0, x -> x + 3)
                .skip(10) // пропускаем первые 10 просто для прикола
                .limit(15) // ограничиваем 15-ю значениями, а то будет бесконечно длиться все это дело
                .forEach(System.out::println);
    }
}
