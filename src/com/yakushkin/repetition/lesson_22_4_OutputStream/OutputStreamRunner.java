package com.yakushkin.repetition.lesson_22_4_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * output stream
 * application ----------------> file
 * <p>
 * input stream
 * application <---------------- file
 */
public class OutputStreamRunner {
    public static void main(String[] args) throws IOException {

        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {

//            String string = "Hello world!\n";
            String string = "Hello World!" + System.lineSeparator();
            fileOutputStream.write(string.getBytes());
        }
    }
}
