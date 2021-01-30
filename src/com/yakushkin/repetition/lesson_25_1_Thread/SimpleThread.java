package com.yakushkin.repetition.lesson_25_1_Thread;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
