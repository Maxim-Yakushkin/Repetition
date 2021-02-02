package com.yakushkin.repetition.lesson_26_2_Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        int newValue = atomicInteger.addAndGet(20);

        System.out.println(value);
        System.out.println(newValue);
    }
}
