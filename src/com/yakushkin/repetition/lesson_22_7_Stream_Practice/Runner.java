package com.yakushkin.repetition.lesson_22_7_Stream_Practice;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {
    private static final Path PATH = Path.of("resources", "test.txt");


    public static void main(String[] args) throws IOException {
        // 5. Задан файл с java-кодом. Прочитать текст программы из файла и
        // записать в другой файл в обратном порядке символы каждой
        // строки.
        List<StringBuilder> reversePersonJava = readPersonJava().stream()
//                .map(x -> {
//                    StringBuilder stringBuilder = new StringBuilder(x);
//                    return stringBuilder.reverse();
//                })
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.toList());
        Path path = Path.of("resources", "streamTask5.txt");
        Files.write(path, reversePersonJava);
        reversePersonJava.forEach(System.out::println);
    }

    private static void task4() throws IOException {
        // 4. Задан файл с java-кодом. Прочитать текст программы из файла и
        // все слова public в объявлении атрибутов и методов класса заменить
        // на слово private. Результат сохранить в другой заранее созданный
        // файл.
        List<String> stringList = readPersonJava().stream()
                .map(x -> x.replaceAll("[^\\s]*public(?!\\sclass)[^\\s]*", "private"))
                .collect(Collectors.toList());
        Files.write(Path.of("resources", "streamTask4.java"), stringList);
        stringList.forEach(System.out::println);
    }

    private static void task3() throws IOException {
        Path path = Path.of("resources", "streamTask3.txt");
        List<String> stringList = Files.readAllLines(path, StandardCharsets.UTF_8);
        stringList.stream()
                .map(Runner::findMaxDigitsCount)
                .forEach(System.out::println);
    }

    private static void task2() throws IOException {
        // 2. Задан файл с текстом, найти и вывести в консоль все слова,  для
        // которых последняя буква одного слова совпадает с первой буквой
        // следующего слова
        try (Scanner scanner = new Scanner(PATH)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next().replaceAll("[.,!?:;]", "");
                if (prev.charAt((prev.length() - 1)) == current.charAt(0)) {
                    System.out.println(prev + " - " + current);
                }
                prev = current;
            }
        }
    }

    private static void task1() throws IOException {
        // 1. Задан файл с текстом, найти и вывести в консоль все слова,
        // начинающиеся с гласной буквы.
        String vowels = "уеыаоэяию";
        try (Scanner scanner = new Scanner(PATH)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if (vowels.indexOf(firstSymbol) != -1) {
                    System.out.println(word);
                }
            }
        }
    }

    private static List<String> readPersonJava() throws IOException {
        Path path = Path.of("src", "com", "yakushkin", "repetition", "lesson_22_7_Stream_Practice", "Person.java");
        return Files.readAllLines(path);
    }

    private static Integer findMaxDigitsCount(String s) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                counter++;
            } else {
                if (result < counter) {
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
