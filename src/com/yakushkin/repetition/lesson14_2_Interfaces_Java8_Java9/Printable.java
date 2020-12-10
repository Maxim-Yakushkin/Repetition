package com.yakushkin.repetition.lesson14_2_Interfaces_Java8_Java9;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {          // С Java8 появились default методы в интерфейсах
        System.out.println(generatedRandom());
        print();
    }

    private static int generatedRandom() {      // С Java9 появились static и private методы в интерфейсах
        return RANDOM.nextInt();
    }

    void print();
}
