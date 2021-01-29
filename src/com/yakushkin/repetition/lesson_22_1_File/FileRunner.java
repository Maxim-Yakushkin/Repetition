package com.yakushkin.repetition.lesson_22_1_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * output stream
 * application ----------------> file
 * <p>
 * input stream
 * application <---------------- file
 */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println("delete: " + file.delete());
        System.out.println("create: " + file.createNewFile());
        System.out.println("exist: " + file.exists());
        System.out.println("isFile: " + file.isFile());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("mkdir: " + file.mkdir());
        System.out.println("mkdirs: " + file.mkdirs());
        System.out.println("name: " + file.getName());
        System.out.println("path: " + file.getPath());
        System.out.println("absolutePath: " + file.getAbsolutePath());
        System.out.println("parent: " + file.getParent());
        System.out.println("absoluteFile: " + file.getAbsoluteFile());
        System.out.println("length: " + file.length());

        File dir = new File("resources/test");
        dir.mkdirs();
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(Arrays.toString(dir.listFiles()));
    }
}
