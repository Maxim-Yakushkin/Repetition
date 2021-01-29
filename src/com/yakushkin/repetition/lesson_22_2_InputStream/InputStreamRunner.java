package com.yakushkin.repetition.lesson_22_2_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * output stream
 * application ----------------> file
 * <p>
 * input stream
 * application <---------------- file
 */
public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {

            read1(inputStream);
            read2(inputStream);
        }
    }

    private static void read1(FileInputStream inputStream) throws IOException {
        // Лучший вариант, если нужно считать весь файл целиком (например тектовый документ)
        byte[] bytes = inputStream.readAllBytes();
        String stringValue = new String(bytes);
        System.out.println(stringValue);
    }

    private static void read2(FileInputStream inputStream) throws IOException {
        // Вариант для считывания файлов больших размеров (например видео). Считывается последовательно по 1 байту
        int available = inputStream.available();
        byte[] bytes = new byte[available];
        int counter = 0;
        byte currentByte;
        while ((currentByte = (byte) inputStream.read()) != -1) {
            bytes[counter++] = currentByte;
        }
        String stringValue = new String(bytes);
        System.out.println(stringValue);
    }
}
