package com.yakushkin.repetition.lesson_22_1_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *              output stream
 * application ----------------> file
 *
 *              input stream
 * application <---------------- file
 *
 * */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.mkdir());
        System.out.println(file.mkdirs());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.length());

        File dir = new File("resources/test");
        dir.mkdirs();
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(Arrays.toString(dir.listFiles()));
    }
}
