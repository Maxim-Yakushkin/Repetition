package com.yakushkin.repetition.lesson_22_5_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class WriterRunner {
    public static void main(String[] args) throws IOException {

        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {

            bufferedWriter.write(System.lineSeparator() + "Hello World from " + WriterRunner.class.getSimpleName() + " with lineSeparator()");

            bufferedWriter.newLine();
            bufferedWriter.write("Hello World! From " + WriterRunner.class.getSimpleName() + " with newLine()");
            bufferedWriter.newLine();
            bufferedWriter.write("Java!");
        }
    }
}
