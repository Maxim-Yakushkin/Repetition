package com.yakushkin.repetition.lesson_25_12_Thread_Practice;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int DEFAULT_BOUND = 10;

    private RandomUtil() {
    }

    public static int getRandomInt() {
        return RANDOM.nextInt(DEFAULT_BOUND);
    }

    public static int getRandomInt(int bound) {
        return RANDOM.nextInt(bound);
    }
}
