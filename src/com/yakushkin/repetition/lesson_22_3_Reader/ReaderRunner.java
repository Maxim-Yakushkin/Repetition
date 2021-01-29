package com.yakushkin.repetition.lesson_22_3_Reader;

import javax.sound.sampled.AudioFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

/**
 * output stream
 * application ----------------> file
 * <p>
 * input stream
 * application <---------------- file
 */
public class ReaderRunner {
    public static void main(String[] args) throws IOException {

        // Удобный вариант считывания текстового файла по строкам с помощью Reader()

        File file = Path.of("resources", "test.txt").toFile();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String collect = fileReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }
}
