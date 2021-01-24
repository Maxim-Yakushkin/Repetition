package com.yakushkin.repetition.lesson_19_15_Collection_Practic;

import java.util.*;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {

        // 1. Написать метод, который принимает целочисленный список и возвращает
        // целочисленный список только с нечетными значениями.
        System.out.println("Задание - 1");
        System.out.println(getAdjectiveList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println();

        // 2. Написать метод countUnique, который принимает целочисленный списк
        // в качестве параметра и возвращает количество уникальных
        // целых чисел в этом списке. При получении пустого списка метод должен возвращать 0.
        // Пример:[3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
        System.out.println("Задание - 2");
        System.out.println(countUnique(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9)));
        System.out.println();

        // 3. Написать метод isUnique, который принимает Map<String, String> и возвращает true,
        // если каждому ключу соответствуют свое уникальное значение.
        // Например, в данном случае вернётся true:
        // {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
        // А в данном false:
        // {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
        System.out.println("Задание - 3");
        System.out.println(
                "Map-1 : " +
                        isUnique(Map.of(
                                "Marty", "Stepp",
                                "Stuart", "Reges",
                                "Jessica", "Miller",
                                "Amanda", "Camp",
                                "Hal", "Perkins"
                        )) + "\n" +
                        "Map-2 : " +
                        isUnique(Map.of(
                                "Marty", "Perkins",
                                "Stuart", "Reges",
                                "Jessica", "Perkins",
                                "Amanda", "Camp",
                                "Hal", "Perkins"
                        ))
        );
        System.out.println();

        // 4. Сложить два многочлена заданной степени, если коэффициенты
        // многочлена хранятся в объекте HashMap в виде:
        // Ключ: номер степени
        // Значение: значение множителя
        // Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
        System.out.println("Задание - 4");
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
        System.out.println(sumPolynomsAndPrintString(polynomial1, polynomial2));
        System.out.println();


    }

    private static String sumPolynomsAndPrintString(Map<Integer, Integer> polynomial1, Map<Integer, Integer> polynomial2) {


        Map<Integer, Integer> polinomResult = sum(polynomial1, polynomial2);

        return convertToString(polinomResult);    // 8x^6 + 9x^5 + 6x^3 + 3x^1 + 10
    }

    public static String convertToString(Map<Integer, Integer> map) {
        TreeMap<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);

        return result.entrySet().stream()
                .map(x -> x.getValue() + "x^" + x.getKey())
                .collect(Collectors.joining(" + "))
                .replace("x^0", "");
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

        return map.values().size() == new HashSet<>(map.values()).size();
    }

    private static int countUnique(List<Integer> integerList) {

        return integerList.size() == 0 ? 0 : new HashSet<>(integerList).size();
    }

    private static List<Integer> getAdjectiveList(List<Integer> integerList) {

        return integerList.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }
}
