package com.yakushkin.repetition.lesson10_2_String_Practic;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task1 {
    public static void main(String[] args) {

        String value = "sdgdsfg :( sdfgh :( sdhfgh :( dfhdrth :) fdhfgh :)";
        String newValue = replace(value);
        System.out.println(newValue);
    }

    private static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
