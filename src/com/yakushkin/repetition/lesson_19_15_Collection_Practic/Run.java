package com.yakushkin.repetition.lesson_19_15_Collection_Practic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Run {
    public static void main(String[] args) {

        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        Map<Integer, Integer> polinomResult = sum(polynomial1, polynomial2);
        System.out.println(convertToString(polinomResult));    // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
    }

    public static String convertToString(Map<Integer, Integer> map) {
        TreeMap<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);

        return result.entrySet().stream()
                .map(x -> x.getValue() + "x^" + x.getKey())
                .collect(Collectors.joining(" + "))
                .replace("x^0","");
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> polynomialResult = new HashMap<>(polynomial1);

        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            Integer value = polynomialResult.putIfAbsent(entry.getKey(), 0);
//            polynomialResult.put(entry.getKey(), value + entry.getValue());
            polynomialResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return polynomialResult;
    }

    private static boolean isUnique(Map<String, String> map) {
        // 3. Написать метод isUnique, который принимает Map<String, String> и возвращает true,
        // если каждому ключу соответствуют свое уникальное значение.
        // Например, в данном случае вернётся true:
        // {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
        // А в данном false:
        // {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
        return map.values().size() == new HashSet<>(map.values()).size();
    }

    private static int countUnique(List<Integer> integerList) {
        // 2. Написать метод countUnique, который принимает целочисленный списк
        // в качестве параметра и возвращает количество уникальных
        // целых чисел в этом списке. При получении пустого списка метод должен возвращать 0.
        // Пример:[3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
        return integerList.size() == 0 ? 0 : new HashSet<>(integerList).size();
    }

    private static List<Integer> getAdjectiveList(List<Integer> integerList) {
        // 1. Написать метод, который принимает целочисленный список и возвращает
        // целочисленный список только с нечетными значениями.
        return integerList.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }
}
