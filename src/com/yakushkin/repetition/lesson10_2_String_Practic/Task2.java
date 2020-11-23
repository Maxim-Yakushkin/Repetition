package com.yakushkin.repetition.lesson10_2_String_Practic;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String word = "123";
        String value = "123srthdfhrt shsdfhstr esfhtjh errsdfsg123";

        boolean startAndEnd = isStartAndEnd(value, word);
        System.out.println(startAndEnd);
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
