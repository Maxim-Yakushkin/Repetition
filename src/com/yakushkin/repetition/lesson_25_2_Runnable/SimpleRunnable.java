package com.yakushkin.repetition.lesson_25_2_Runnable;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " + SimpleRunnable.class.getSimpleName());
    }
}
