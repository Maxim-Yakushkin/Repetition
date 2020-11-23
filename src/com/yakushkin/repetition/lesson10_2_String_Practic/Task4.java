package com.yakushkin.repetition.lesson10_2_String_Practic;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String value = "sdfgdf.,sdfg!!sdfgg.,?";

        int count = countSymbols(value);
        System.out.println(count);
    }

    public static int countSymbols(String value) {
        String replace = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - replace.length();
    }
}
