package com.yakushkin.repetition.lesson_22_6_Files;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class FilesRunner {
    private static final Path PATH = Path.of("resources", "files.txt");

    public static void main(String[] args) throws IOException {
        readFiles1();
        readFiles2();
        readFiles3();
    }

    private static void readFiles3() throws IOException {
        try (Stream<String> lines = Files.lines(PATH)) {
            lines.forEach(System.out::println);
        }
    }

    private static void readFiles2() throws IOException {
        Files.readAllLines(PATH)
                .forEach(System.out::println);
    }

    private static void readFiles1() throws IOException {
        String string = Files.readString(PATH);
        System.out.println(string);
    }

    private static void filesWrite(Path path) throws IOException {
        Class<FilesRunner> class_ = FilesRunner.class;
        Files.write(path, List.of(
                class_.getName(),
                class_.getCanonicalName(),
                class_.getSimpleName(),
                class_.getPackageName()), StandardCharsets.UTF_8);
//                class_.getPackageName()), StandardCharsets.UTF_8, StandardOpenOption.APPEND); // Добавляет данные к сущетвующим
    }
}
