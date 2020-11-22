package com.yakushkin.repetition.lesson1_1;

public class Intro {
    public static void main(String[] args) {
        int integer = 7;
        Integer integer2 = 54;
        var integer3 = 10;
        int[] intValues = {13, 134, integer, 1423, integer2, integer3};

        printArray(intValues);
    }

    private static void printArray(int[] values) {
        for (int i : values) {
            System.out.println(i);
        }
    }
}
